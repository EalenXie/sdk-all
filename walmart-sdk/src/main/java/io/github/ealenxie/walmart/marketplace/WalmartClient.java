package io.github.ealenxie.walmart.marketplace;

import io.github.ealenxie.walmart.marketplace.vo.WalmartToken;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;
import java.util.UUID;

/**
 * Created by EalenXie on 2022/3/16 14:02
 */
public class WalmartClient {

    private final RestOperations restOperations;
    /**
     * Walmart Marketplace API Host地址 <a href="https://marketplace.walmartapis.com">https://marketplace.walmartapis.com</a>
     */
    public static final String HOST = "https://marketplace.walmartapis.com";
    /**
     * Walmart Marketplace API 沙箱环境地址
     */
    public static final String SANDBOX_HOST = "https://sandbox.walmartapis.com";
    /**
     * 沙箱模式
     */
    private boolean sandBoxMode = false;

    @SuppressWarnings("all")
    public static final String WM_SVC_NAME = "WM_SVC.NAME";
    @SuppressWarnings("all")
    public static final String WM_QOS_CORRELATION_ID = "WM_QOS.CORRELATION_ID";
    @SuppressWarnings("all")
    public static final String WM_SEC_ACCESS_TOKEN = "WM_SEC.ACCESS_TOKEN";


    public WalmartClient() {
        this(new RestTemplate());
    }

    public WalmartClient(RestOperations restOperations) {
        this.restOperations = restOperations;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    public boolean isSandBoxMode() {
        return sandBoxMode;
    }

    public void setSandBoxMode(boolean sandBoxMode) {
        this.sandBoxMode = sandBoxMode;
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/auth#operation/tokenAPI">获取accessToken</a>
     *
     * @return 访问令牌
     */
    public WalmartToken accessToken(String clientId, String clientSecret) {
        HttpHeaders headers = getBasicHeaders(clientId, clientSecret);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        return getRestOperations().exchange(URI.create(String.format("%s/v3/token?grant_type=client_credentials", isSandBoxMode() ? SANDBOX_HOST : HOST)), HttpMethod.POST, new HttpEntity<>(null, headers), WalmartToken.class).getBody();
    }

    /**
     * 获取公共的请求头
     */
    public HttpHeaders getBasicHeaders(String clientId, String clientSecret) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(clientId, clientSecret);
        headers.set(WM_SVC_NAME, "Walmart Marketplace");
        headers.set(WM_QOS_CORRELATION_ID, UUID.randomUUID().toString());
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return headers;
    }

}
