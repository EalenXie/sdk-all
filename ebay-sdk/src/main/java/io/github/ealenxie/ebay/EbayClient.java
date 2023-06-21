package io.github.ealenxie.ebay;

import io.github.ealenxie.ebay.dto.EbayFilterDTO;
import io.github.ealenxie.ebay.vo.EbayAccessToken;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.beans.PropertyDescriptor;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by EalenXie on 2022/3/29 11:36
 */
public class EbayClient {

    private final RestOperations restOperations;

    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;

    /**
     * 沙箱环境认证接口地址
     */
    private static final String HOST_SANDBOX = "https://api.sandbox.ebay.com";

    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://api.ebay.com";


    public EbayClient() {
        this(new RestTemplate());
    }

    public EbayClient(RestOperations restOperations) {
        this.restOperations = restOperations;
    }

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }


    public HttpHeaders getBasicHeader(String clientId, String clientSecret) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(clientId, clientSecret);
        return headers;
    }


    /**
     * <a href="https://developer.ebay.com/api-docs/static/oauth-client-credentials-grant.html">客户端模式获取访问令牌</a>
     *
     * @param clientId     客户端ID
     * @param clientSecret 密钥
     */
    public EbayAccessToken accessToken(String clientId, String clientSecret) {
        HttpHeaders headers = getBasicHeader(clientId, clientSecret);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Accept-Language", "en_US");
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/identity/v1/oauth2/token", isSandBox() ? HOST_SANDBOX : HOST));
        builder.queryParam("grant_type", "client_credentials");
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(null, headers), EbayAccessToken.class).getBody();
    }


    @SuppressWarnings("all")
    public HttpHeaders getEbayHeader(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("X-EBAY-C-MARKETPLACE-ID", "EBAY-US");
        return headers;
    }


    public String filterQueryString(EbayFilterDTO filter) {
        StringBuilder sb = new StringBuilder();
        BeanWrapper wrapper = new BeanWrapperImpl(filter);
        PropertyDescriptor[] pds = wrapper.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : pds) {
            String propertyName = descriptor.getName();
            Object propertyValue = wrapper.getPropertyValue(propertyName);
            handleFilterProperty(propertyName, propertyValue, sb);
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : sb.toString();
    }

    public void handleFilterProperty(String propertyName, Object propertyValue, StringBuilder sb) {
        if (!propertyName.equals("class")) {
            List<String> date = Arrays.asList("transactionDate", "payoutDate", "creationdate", "lastmodifieddate");
            if (date.contains(propertyName)) {
                if (!ObjectUtils.isEmpty(propertyValue)) {
                    sb.append(String.format("filter=%s:%s&", propertyName, propertyValue));
                }
            } else {
                if (!ObjectUtils.isEmpty(propertyValue)) {
                    sb.append(String.format("filter=%s:{%s}&", propertyName, propertyValue));
                }
            }
        }
    }

}
