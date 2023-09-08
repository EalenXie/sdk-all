package io.github.ealenxie.shopify;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/08/05 15:50
 */
public abstract class ShopifyClient {

    private final RestOperations restOperations;


    protected ShopifyClient(RestOperations restOperations) {
        this.restOperations = restOperations;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    public HttpHeaders getPasswordHeader(String password) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Shopify-Access-Token", password);
        return headers;
    }


    public HttpHeaders getPasswordJsonHeader(String password) {
        HttpHeaders headers = getPasswordHeader(password);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    /**
     * 获取Shopify 接口地址
     * 拼接公式: https://{apiKey}:{adminAccessToken}@{hostname}/admin/api/{apiVersion}
     *
     * @param apiKey           api key
     * @param adminAccessToken admin access token
     * @param hostname         店铺host
     * @param apiVersion       接口版本
     */
    public String getShopifyApiHost(String apiKey, String adminAccessToken, String hostname, String apiVersion) {
        return String.format("https://%s:%s@%s/admin/api/%s", apiKey, adminAccessToken, hostname, apiVersion);
    }

    @Nullable
    public String getShopifyNext(HttpHeaders respHeader) {
        List<String> links = respHeader.get("link");
        if (!ObjectUtils.isEmpty(links)) {
            for (String link : links) {
                String[] split = link.contains(",") ? link.split(",") : new String[]{link};
                for (String l : split) {
                    if (l.contains("rel=\"next\"")) {
                        int index = l.indexOf("<");
                        int lastIndex = l.lastIndexOf(">");
                        return l.substring(index + 1, lastIndex);
                    }
                }
            }
        }
        return null;
    }

}
