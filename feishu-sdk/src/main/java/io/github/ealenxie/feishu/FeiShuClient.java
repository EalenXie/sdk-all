package io.github.ealenxie.feishu;

import io.github.ealenxie.feishu.message.FeiShuMessage;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by EalenXie on 2022/2/14 17:01
 * <a href="https://open.feishu.cn/document/ukTMukTMukTM/ucTM5YjL3ETO24yNxkjN">飞书开发平台</a>
 */
public class FeiShuClient {

    private final RestOperations restOperations;

    private final HttpHeaders httpHeaders;
    private static final String ALGORITHM = "HmacSHA256";

    public FeiShuClient() {
        this(new RestTemplate());
    }

    public FeiShuClient(RestOperations restOperations) {
        this.restOperations = restOperations;
        // 钉钉请求头为 application/json
        httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    }


    /**
     * 钉钉接口签名
     *
     * @param timestamp 时间戳
     * @param signKey   签名密钥
     * @return 签名
     */
    public static String sign(long timestamp, String signKey) {
        String stringToSign = timestamp + "\n" + signKey;
        try {
            Mac mac = Mac.getInstance(ALGORITHM);
            mac.init(new SecretKeySpec(signKey.getBytes(StandardCharsets.UTF_8), ALGORITHM));
            byte[] signData = mac.doFinal(stringToSign.getBytes(StandardCharsets.UTF_8));
            return URLEncoder.encode(new String(Base64.encodeBase64(signData)), StandardCharsets.UTF_8.name());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException | InvalidKeyException e) {
            throw new UnsupportedOperationException(e);
        }
    }


    /**
     * 调用钉钉机器人接口
     *
     * @param fullUrl 接口完整路径
     * @param message 钉钉机器人消息
     */
    public ResponseEntity<Object> sendMessage(String fullUrl, FeiShuMessage message, String signKey) {
        if (!ObjectUtils.isEmpty(signKey)) {
            long timestamp = System.currentTimeMillis();
            String sign = sign(timestamp, signKey);
            message.setTimestamp(String.valueOf(timestamp));
            message.setSign(sign);
        }
        HttpEntity<FeiShuMessage> entity = new HttpEntity<>(message, httpHeaders);
        return restOperations.postForEntity(fullUrl, entity, Object.class);

    }
}
