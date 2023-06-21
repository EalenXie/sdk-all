package io.github.ealenxie;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

/**
 * Created by EalenXie on 2022/9/22 9:54
 */
public abstract class FopClient {

    private static final String FOP_URL = "https://open.4px.com";

    private static final String TEST_FOP_URL = "https://open-test.4px.com";

    private final RestOperations restOperations;

    private final ObjectMapper objectMapper;
    /**
     * 当前是否沙箱环境
     */
    private boolean sandBox = true;

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    protected FopClient(RestOperations restOperations, ObjectMapper objectMapper) {
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
    }

    protected FopClient() {
        this.restOperations = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    protected FopClient(RestOperations restOperations) {
        this.restOperations = restOperations;
        this.objectMapper = new ObjectMapper();
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    private HttpHeaders getFopHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    /**
     * 调用FOP接口
     * <a href="http://open.4px.com/apiInfo/partner">http://open.4px.com/apiInfo/introduce</a>
     *
     * @param method HttpMethod
     * @param common 请求的公共参数
     * @param body   请求body
     * @return 调用FOP返回接口
     */
    public String callFop(HttpMethod method, CommonArgs common, Object body) {
        String bodyJson = getBodyJson(body);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/router/api/service", isSandBox() ? TEST_FOP_URL : FOP_URL));
        SortedMap<String, String> sortedMap = objectMapper.convertValue(common, new TypeReference<SortedMap<String, String>>() {
        });
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.setAll(sortedMap);
        // 4PX 签名
        String signString = String.format("app_key%sformat%smethod%stimestamp%sv%s%s%s", common.getAppKey(), common.getFormat(), common.getMethod(), common.getTimestamp(), common.getVersion(), bodyJson, common.getAppSecret());
        String sign = DigestUtils.md5DigestAsHex(signString.getBytes(StandardCharsets.UTF_8));
        queryParams.set("sign", sign);
        builder.queryParams(queryParams);
        URI uri = builder.build().toUri();
        return getRestOperations().exchange(uri, method, new HttpEntity<>(bodyJson, getFopHeader()), String.class).getBody();
    }

    private String getBodyJson(Object body) {
        if (body instanceof String) {
            return (String) body;
        }
        return body == null ? "" : writeValueAsString(body);
    }


    /**
     * 从webservice接口协议中读取YDH的响应结果
     *
     * @param body 响应的流数据
     */
    protected <T> T readFopBody(String body, TypeReference<T> valueTypeRef) {
        try {
            return objectMapper.readValue(body, valueTypeRef);
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 同objectMapper.writeValueAsString
     */
    private String writeValueAsString(Object body) {
        try {
            return objectMapper.writeValueAsString(body);
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
