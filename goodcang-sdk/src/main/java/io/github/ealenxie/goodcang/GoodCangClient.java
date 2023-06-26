package io.github.ealenxie.goodcang;


import io.github.ealenxie.goodcang.dto.GetInventoryLog;
import io.github.ealenxie.goodcang.dto.GetProductInventory;
import io.github.ealenxie.goodcang.dto.InventoryAgeList;
import io.github.ealenxie.goodcang.dto.SetInventoryWarning;
import io.github.ealenxie.goodcang.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.List;

/**
 * Created by EalenXie on 2022/9/22 10:34
 */
public class GoodCangClient {
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

    public GoodCangClient(String appKey, String appToken) {
        this(appKey, appToken, new RestTemplate());
    }

    public GoodCangClient(String appKey, String appToken, RestOperations restOperations) {
        this.appKey = appKey;
        this.appToken = appToken;
        this.restOperations = restOperations;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/get_product_inventory">获取库存</a>
     */
    public ResponsePage<List<ProductInventory>> getProductInventory(String appKey, String appToken, GetProductInventory dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/inventory/get_product_inventory", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponsePage<List<ProductInventory>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponsePage<List<ProductInventory>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/get_inventory_log">获取库存动态列表</a>
     */
    public ResponsePage<List<InventoryLog>> getInventoryLog(String appKey, String appToken, GetInventoryLog dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/inventory/get_inventory_log", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponsePage<List<InventoryLog>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponsePage<List<InventoryLog>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/inventory_age_list">获取库龄列表</a>
     */
    public ResponseCode<InventoryAgeTotal> inventoryAgeList(String appKey, String appToken, InventoryAgeList dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/inventory/inventory_age_list", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseCode<InventoryAgeTotal>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponseCode<InventoryAgeTotal>>() {
        });
        return exchange.getBody();
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/set_inventory_warning">设置库龄预警</a>
     */
    public ResponseCode<Void> setInventoryWarning(String appKey, String appToken, SetInventoryWarning dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/inventory/set_inventory_warning", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseCode<Void>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponseCode<Void>>() {
        });
        return exchange.getBody();
    }


    /**
     * @param appKey   appKey
     * @param appToken appToken
     */
    @SuppressWarnings("all")
    protected HttpHeaders getGoodCangHeaders(String appKey, String appToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("app-key", appKey);
        headers.add("app-token", appToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }


    /**
     * post调用goodcang接口
     *
     * @param urlNotPrefix 无环境前缀的url路径
     * @param payload      请求参数
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
