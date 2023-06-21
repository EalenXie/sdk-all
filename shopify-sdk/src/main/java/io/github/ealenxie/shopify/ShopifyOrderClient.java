package io.github.ealenxie.shopify;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.shopify.dto.*;
import io.github.ealenxie.shopify.vo.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

/**
 * @author EalenXie
 * @since 2022/08/05 15:51
 */
public class ShopifyOrderClient extends ShopifyClient {

    private final ObjectMapper objectMapper;

    public ShopifyOrderClient() {
        this(new RestTemplate());
    }

    public ShopifyOrderClient(RestOperations restOperations) {
        super(restOperations);
        this.objectMapper = new ObjectMapper();
    }

    public ShopifyOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(restOperations);
        this.objectMapper = objectMapper;
    }


    /**
     * 获取包含请求参数的 URI对象
     *
     * @param url            请求地址
     * @param queryParamsDTO 路径请求参数
     */
    public URI getURI(String url, @Nullable Object queryParamsDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        if (queryParamsDTO != null) {
            Map<String, String> args = objectMapper.convertValue(queryParamsDTO, new TypeReference<Map<String, String>>() {
            });
            LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
            req.setAll(args);
            builder.queryParams(req);
        }
        return builder.build().encode().toUri();
    }


    /**
     * <a href="https://shopify.dev/api/admin-rest/2021-10/resources/order">Retrieve a list of orders</a>
     *
     * @param host 请详见查看  {@link ShopifyClient#getShopifyApiHost(String, String, String, String)}
     */
    public ResponseEntity<OrdersResource> getOrders(String host, String password, OrdersDTO dto) {
        String url = String.format("%s/orders.json", host);
        HttpHeaders header = getPasswordJsonHeader(password);
        return getRestOperations().exchange(getURI(url, dto), HttpMethod.GET, new HttpEntity<>(null, header), OrdersResource.class);
    }


    /**
     * <a href="https://shopify.dev/api/admin-rest/2021-10/resources/order#get-orders">Retrieve a list of orders</a>
     * <p> 拉取shopify下一页订单</p>
     *
     * @param nextHost 下一页的接口url
     * @param password 密码
     */
    public ResponseEntity<OrdersResource> getOrders(String nextHost, String password) {
        HttpHeaders header = getPasswordJsonHeader(password);
        return getRestOperations().exchange(URI.create(nextHost), HttpMethod.GET, new HttpEntity<>(null, header), OrdersResource.class);
    }


    /**
     * <a href="https://shopify.dev/api/admin-rest/2021-10/resources/order-risk#get-orders-order-id-risks">Retrieves a list of all order risks for an order</a>
     * <p>检索订单的所有订单风险列表</p>
     */
    public OrdersRiskResource getOrdersRisks(Long orderId, String host, String password) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/orders/%s/risks.json", host, orderId);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.GET, new HttpEntity<>(null, header), OrdersRiskResource.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/api/admin-rest/2021-10/resources/transaction#get-orders-order-id-transactions">Retrieves a list of transactions</a>
     * <p>获取交易流水号</p>
     */
    public FinanceResource getShopifyFinance(Long orderId, String host, String password) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/orders/%s/transactions.json", host, orderId);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.GET, new HttpEntity<>(null, header), FinanceResource.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/location#get-locations">Retrieve a list of locations</a>
     * <p>获取位置</p>
     */
    public LocationResource location(String host, String password) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/locations.json", host);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, header), LocationResource.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/fulfillment#post-fulfillments">Creates a fulfillment for one or many fulfillment orders</a>
     * <p>为一个或多个发货订单创建发货</p>
     */
    public FulfillmentResource fulfillment(String host, String password, FulfillmentDTO dto) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/fulfillments.json", host);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.POST, new HttpEntity<>(dto, header), FulfillmentResource.class).getBody();
    }


    /**
     * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/fulfillment#get-fulfillment-orders-fulfillment-order-id-fulfillments">Retrieves fulfillments associated with a fulfillment order</a>
     * <p>检索与订单关联的发货   用于查看标记发货成功几个商品和数量</p>
     */
    public FulfillmentsResource fulfillments(String host, String password, String orderId) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/orders/%s/fulfillments.json", host, orderId);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.GET, new HttpEntity<>(null, header), FulfillmentsResource.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/fulfillmentorder#get-orders-order-id-fulfillment-orders">Retrieves a list of fulfillment orders for a specific order</a>
     * <p>检索与订单关联的发货订单列表  用于查询标发需要的参数</p>
     */
    public FulfillmentOrderResource fulfillmentOrders(String host, String password, String orderId) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/orders/%s/fulfillment_orders.json", host, orderId);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.GET, new HttpEntity<>(null, header), FulfillmentOrderResource.class).getBody();
    }


    /**
     * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/carrierservice#get-carrier-services">Receive a list of all CarrierServices</a>
     * <p>运营商服务</p>
     */
    public CarrierServiceResource carrierServices(String host, String password) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/carrier_services.json", host);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.GET, new HttpEntity<>(null, header), CarrierServiceResource.class).getBody();
    }


    /**
     * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/order#get-orders-order-id?fields=id,line-items,name,total-price">Retrieve a specific order</a>
     * <p>获取单个订单</p>
     */
    public OrderResource getOrder(String host, String password, String orderId) {
        HttpHeaders header = getPasswordJsonHeader(password);
        String url = String.format("%s/orders/%s.json", host, orderId);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.GET, new HttpEntity<>(null, header), OrderResource.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/order#get-orders-order-id?fields=id,line-items,name,total-price">Retrieve a specific order</a>
     * <p>获取单个订单</p>
     */
    public OrderResource getOrder(BasicInfo basicInfo, String orderId) {
        HttpHeaders header = getPasswordJsonHeader(basicInfo.getAdminAccessToken());
        String host = getShopifyApiHost(basicInfo);
        String url = String.format("%s/orders/%s.json", host, orderId);
        return getRestOperations().exchange(getURI(url, null), HttpMethod.GET, new HttpEntity<>(null, header), OrderResource.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/docs/api/admin-rest/2023-01/resources/payouts#get-shopify-payments-payouts">获得单个店铺的结算单</a>
     *
     * @param basicInfo 封装了授权信息的对象
     * @return 单个店铺的结算集合
     */
    public ShopifyPayouts getPayouts(BasicInfo basicInfo, GetPayoutsDTO getPayoutsDTO) {
        String host = getShopifyApiHost(basicInfo);
        HttpHeaders header = getPasswordJsonHeader(basicInfo.getAdminAccessToken());
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shopify_payments/payouts.json", host));
        builder = getPayoutsDTO.getBuilder(builder);
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, header), ShopifyPayouts.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/docs/api/admin-rest/2023-01/resources/payouts#get-shopify-payments-payouts-payout-id">通过payoutId获得payOut对象</a>
     *
     * @param id        payOutId
     * @param basicInfo 封装了授权信息的对象
     * @return 单个payout对象
     */
    public ShopifyPayout getPayoutById(String id, BasicInfo basicInfo) {
        String host = getShopifyApiHost(basicInfo);
        HttpHeaders header = getPasswordJsonHeader(basicInfo.getAdminAccessToken());
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shopify_payments/balance/transactions.json", host));
        builder.queryParam("payout_id", id);
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, header), ShopifyPayout.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/docs/api/admin-rest/2023-01/resources/transactions#get-shopify-payments-balance-transactions?payout-id=623721858">通过payoutId获得明细集合对象</a>
     *
     * @param basicInfo 封装了授权信息的对象
     * @return 明细集合
     */
    public ShopifyTransactions getTransactionsByPayoutId(BasicInfo basicInfo, GetTransactionsDTO getTransactionsDTO) {
        String host = getShopifyApiHost(basicInfo);
        HttpHeaders header = getPasswordJsonHeader(basicInfo.getAdminAccessToken());
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shopify_payments/balance/transactions.json", host));
        builder = getTransactionsDTO.getBuilder(builder);
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, header), ShopifyTransactions.class).getBody();
    }

    /**
     * <a href="https://shopify.dev/docs/api/admin-rest/2023-01/resources/transaction#get-orders-order-id-transactions-transaction-id">通过payoutId获得明细集合对象</a>
     * <p>
     * 根据订单id与订单明细id拿到明细详情
     */
    public TransactionDTO getOrderTransactionById(Long orderId, Long orderTransactionId, BasicInfo basicInfo) {
        String host = getShopifyApiHost(basicInfo);
        HttpHeaders header = getPasswordJsonHeader(basicInfo.getAdminAccessToken());
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/orders/%s/transactions/%s.json", host, orderId, orderTransactionId));
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, header), TransactionDTO.class).getBody();
    }

    /**
     * 获取Shopify 接口地址
     * 拼接公式: https://{apiKey}:{adminAccessToken}@{hostname}/admin/api/{apiVersion}
     *
     * @param basicInfo 返回一个完整的访问路径
     */
    public String getShopifyApiHost(BasicInfo basicInfo) {
        return String.format("https://%s:%s@%s/admin/api/%s", basicInfo.getApiKey(), basicInfo.getAdminAccessToken(), basicInfo.getHostName(), basicInfo.getApiVersion());
    }


}
