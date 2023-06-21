package io.github.ealenxie.aliyun.ocr;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.aliyun.ocr.dto.Common;
import io.github.ealenxie.aliyun.ocr.dto.OcrFile;
import io.github.ealenxie.aliyun.ocr.vo.OcrResponse;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by EalenXie on 2023/3/23 10:14
 */
public abstract class OcrClient {
    public static final String SEPARATOR = "&";
    public static final String ALGORITHM_NAME = "HmacSHA1";
    /**
     * 服务接入点 默认杭州 华东1  如需更改此endpoint {@link OcrClient#setEndpoint(String)}
     */
    private String endpoint = "https://ocr-api.cn-hangzhou.aliyuncs.com";
    private final String accessKeyId;
    private final String accessKeySecret;
    private final ObjectMapper objectMapper;
    private final RestOperations restOperations;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    protected OcrClient(String accessKeyId, String accessKeySecret) {
        this(accessKeyId, accessKeySecret, new RestTemplate());
    }

    protected OcrClient(String accessKeyId, String accessKeySecret, RestOperations restOperations) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.objectMapper = defaultObjectMapper();
        this.restOperations = restOperations;
    }

    protected OcrClient(String accessKeyId, String accessKeySecret, ObjectMapper objectMapper, RestOperations restOperations) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.objectMapper = objectMapper;
        this.restOperations = restOperations;
    }

    private ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature(), true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }


    /**
     * @param response  阿里云接口响应
     * @param classType 对象类型
     */
    protected <T> T getData(ResponseEntity<OcrResponse> response, TypeReference<T> classType) {
        OcrResponse ocrResponse = response.getBody();
        try {
            assert ocrResponse != null;
            return objectMapper.readValue(ocrResponse.getData(), classType);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 当识别结果返回指有多种类型时,自行序列化的方法
     *
     * @param recognizeData 识别结果
     * @param classType     对象类型
     */
    protected <T> T getRecognizeData(RecognizeData<?> recognizeData, Class<T> classType) {
        Object data = recognizeData.getData();
        try {
            assert data != null;
            return objectMapper.readValue(objectMapper.writeValueAsString(data), classType);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }


    /**
     * 接口文档  <a href="https://help.aliyun.com/document_detail/294531.html">阿里云OCR接口调用</a>
     */
    public <T> ResponseEntity<T> ocr(String action, Object dto, Class<T> type) {
        SortedMap<String, String> args = getArgs(new Common(accessKeyId, action), dto);
        HttpMethod method = HttpMethod.POST;
        String signature = getSignature(args, method.name(), accessKeySecret);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.setAll(args);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(endpoint).queryParams(queryParams);
        URI uri = builder.build().encode().toUri();
        // ali ocr 的编码规则 RFC3986 要求单独编码
        String url = String.format("%s&Signature=%s", uri, percentEncode(signature));
        HttpEntity<Object> httpEntity = new HttpEntity<>((dto instanceof OcrFile) ? ((OcrFile) dto).getBytes() : null, headers);
        return restOperations.exchange(URI.create(url), method, httpEntity, type);
    }


    /**
     * 获取 请求参数
     *
     * @param common 公共请求参数
     * @param dto    请求dto
     * @return 获取url请求参数
     */
    private SortedMap<String, String> getArgs(Common common, Object dto) {
        SortedMap<String, String> commonArgs = objectMapper.convertValue(common, new TypeReference<SortedMap<String, String>>() {
        });
        SortedMap<String, String> queryDTO = objectMapper.convertValue(dto, new TypeReference<SortedMap<String, String>>() {
        });
        commonArgs.putAll(queryDTO);
        return commonArgs;
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/469176.html">OCR签名</a>
     *
     * @param signedParams 签名参数
     * @param method       请求方法
     * @param secret       签名secret
     */
    private String getSignature(SortedMap<String, ?> signedParams, String method, String secret) {
        try {
            StringBuilder queryString = new StringBuilder();
            for (Map.Entry<String, ?> entry : signedParams.entrySet()) {
                if (!ObjectUtils.isEmpty(entry.getValue()) && !"Signature".equals(entry.getValue())) {
                    queryString.append(SEPARATOR).append(percentEncode(entry.getKey())).append("=").append(percentEncode((String) entry.getValue()));
                }
            }
            String stringToSign = method + SEPARATOR + percentEncode("/") + SEPARATOR + percentEncode(queryString.substring(1));
            Mac mac = Mac.getInstance(ALGORITHM_NAME);
            mac.init(new SecretKeySpec((secret + SEPARATOR).getBytes(StandardCharsets.UTF_8), ALGORITHM_NAME));
            byte[] signData = mac.doFinal(stringToSign.getBytes(StandardCharsets.UTF_8));
            return Base64.encodeBase64String(signData);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new UnsupportedOperationException("签名异常:", e);
        }
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/294534.html">ocr 参数编码方法</a>
     */
    private String percentEncode(String value) {
        if (value == null) {
            return null;
        }
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name()).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (Exception e) {
            throw new UnsupportedOperationException("编码异常:", e);
        }
    }


}
