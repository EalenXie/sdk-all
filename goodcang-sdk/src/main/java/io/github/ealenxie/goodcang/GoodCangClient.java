package io.github.ealenxie.goodcang;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;

/**
 * Created by EalenXie on 2022/9/22 10:34
 */
public abstract class GoodCangClient {
    protected static final String HOST = "https://oms.goodcang.net/public_open";
    protected static final String TEST_HOST = "https://uat-oms.eminxing.com/public_open";
    private final String appKey;
    private final String appToken;
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

    private final RestOperations restOperations;

    protected GoodCangClient(String appKey, String appToken) {
        this(appKey, appToken, new RestTemplate());
    }

    protected GoodCangClient(String appKey, String appToken, RestOperations restOperations) {
        this.appKey = appKey;
        this.appToken = appToken;
        this.restOperations = restOperations;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    /**
     * post调用goodcang接口
     *
     * @param urlNotPrefix               无环境前缀的url路径
     * @param payload                    请求参数
     * @param parameterizedTypeReference 参数返回类型
     */
    @SuppressWarnings("all")
    protected <T> T postGoodCang(String urlNotPrefix, @Nullable Object payload, ParameterizedTypeReference<T> parameterizedTypeReference) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", isSandBox() ? TEST_HOST : HOST, urlNotPrefix));
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.add("app-key", appKey);
        headers.add("app-token", appToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(payload, headers), parameterizedTypeReference).getBody();
    }

}
