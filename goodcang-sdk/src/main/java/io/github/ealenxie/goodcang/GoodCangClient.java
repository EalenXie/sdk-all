package io.github.ealenxie.goodcang;


import io.github.ealenxie.goodcang.dto.*;
import io.github.ealenxie.goodcang.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
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

    private static final String HOST = "https://oms.goodcang.net/public_open";

    private static final String TEST_HOST = "https://uat-oms.eminxing.com/public_open";

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

    public GoodCangClient() {
        this(new RestTemplate());
    }

    public GoodCangClient(RestOperations restOperations) {
        this.restOperations = restOperations;

    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_list">获取订单列表</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param dto      订单列表请求参数
     */
    public ResponsePage<List<Order>> orderList(String appKey, String appToken, OrderListDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/get_order_list", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponsePage<List<Order>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponsePage<List<Order>>>() {
        });
        return exchange.getBody();
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_by_ref_code">根据参考号获取单票订单信息</a>
     *
     * @param appKey      appKey
     * @param appToken    appToken
     * @param referenceNo 参考号
     */
    public ResponseAsk<Order> getOrderByRefCode(String appKey, String appToken, String referenceNo) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/get_order_by_ref_code", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseAsk<Order>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(new ReferenceNoDTO(referenceNo), getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponseAsk<Order>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/create_order">新建出库单</a>
     *
     * @param appKey   appKey
     * @param appToken appToken
     * @param dto      请求参数
     */
    public OrderCodeResponse createOrder(String appKey, String appToken, CreateOrderDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/create_order", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<OrderCodeResponse> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), OrderCodeResponse.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/cancel_order">取消订单</a>
     */
    public CancelOrderResponse cancelOrder(String appKey, String appToken, CancelOrderDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/cancel_order", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<CancelOrderResponse> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), CancelOrderResponse.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/upload_order_label">上传面单</a>
     */
    public ResponseAsk<Void> uploadOrderLabel(String appKey, String appToken, UploadOrderLabelDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/upload_order_label", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseAsk<Void>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/add_product">新建商品</a>
     */
    public AddProductResponse addProduct(String appKey, String appToken, AddProductDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/product/add_product", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<AddProductResponse> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), AddProductResponse.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_product_sku_list">获取商品列表</a>
     */
    public ResponsePage<List<ProductSkuVO>> getProductSkuList(String appKey, String appToken, GetProductSkuList dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/product/get_product_sku_list", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponsePage<List<ProductSkuVO>>>() {
        }).getBody();
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
     * <a href="https://open.goodcang.com/docs_api/base_data/get_warehouse">获取仓库信息</a>
     */
    public ResponsePage<List<Warehouse>> getWarehouse(String appKey, String appToken) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/base_data/get_warehouse", isSandBox() ? TEST_HOST : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponsePage<List<Warehouse>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(null, getGoodCangHeaders(appKey, appToken)), new ParameterizedTypeReference<ResponsePage<List<Warehouse>>>() {
        });
        return exchange.getBody();
    }


    /**
     * @param appKey   appKey
     * @param appToken appToken
     */
    @SuppressWarnings("all")
    public HttpHeaders getGoodCangHeaders(String appKey, String appToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("app-key", appKey);
        headers.add("app-token", appToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }


}
