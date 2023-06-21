package io.github.ealenxie.amazon;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.amazon.dto.OrdersDTO;
import io.github.ealenxie.amazon.dto.ShipmentDTO;
import io.github.ealenxie.amazon.vo.AmazonResponse;
import io.github.ealenxie.amazon.vo.AmazonToken;
import io.github.ealenxie.amazon.vo.order.AmazonBuyerInfo;
import io.github.ealenxie.amazon.vo.order.AmazonOrder;
import io.github.ealenxie.amazon.vo.order.AmazonOrderItems;
import io.github.ealenxie.amazon.vo.order.AmazonShippingAddress;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

/**
 * Created by EalenXie on 2022/2/22 10:13
 * <a href="https://developer-docs.amazon.com/sp-api/docs/orders-api-v0-reference">亚马逊订单api</a>
 */
public class AmazonClient {

    private final ObjectMapper mapper;


    private final RestOperations restOperations;
    /**
     * Amazon 授权地址 <a href="https://sellercentral.amazon.com/apps/authorize/consent">https://sellercentral.amazon.com/apps/authorize/consent</a>
     */
    private static final String AUTHORIZE_URL = "https://sellercentral.amazon.com/apps/authorize/consent";
    /**
     * Amazon 认证接口地址 <a href="https://api.amazon.com/auth/o2/token">https://api.amazon.com/auth/o2/token</a>
     */
    private static final String TOKEN_URL = "https://api.amazon.com/auth/o2/token";
    /**
     * Amazon selling partner(SP) Host地址 <a href="https://sellingpartnerapi-na.amazon.com">https://sellingpartnerapi-na.amazon.com</a>
     */
    private static final String SELLING_PARTNER_HOST = "https://sellingpartnerapi-na.amazon.com";


    public AmazonClient() {
        this(new RestTemplate());
    }

    public AmazonClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public AmazonClient(ObjectMapper objectMapper, RestOperations restOperations) {
        this.mapper = objectMapper;
        this.restOperations = restOperations;
    }


    /**
     * 获取包含认证的 Bearer 标准请求头
     *
     * @param accessToken 令牌
     */
    public HttpHeaders getBearerHeaders(String accessToken) {
        HttpHeaders bearTokenHeader = new HttpHeaders();
        bearTokenHeader.setBearerAuth(accessToken);
        return bearTokenHeader;
    }

    /**
     * 获取包含认证的 Basic 标准请求头
     *
     * @param clientId     客户端Id
     * @param clientSecret 客户端密钥
     */
    public HttpHeaders getBasicHeaders(String clientId, String clientSecret) {
        HttpHeaders basicHeader = new HttpHeaders();
        basicHeader.setBasicAuth(clientId, clientSecret);
        return basicHeader;
    }

    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/website-authorization-workflow">获取授权地址</a>
     *
     * @param applicationId 应用Id
     * @param state         应用程序生成的状态值。
     * @param version       如果您包含该参数version=beta，则工作流会授权处于草稿状态的应用程序。如果您不包含该参数，则工作流程会授权在 Amazon Seller Central Partner Network 上发布的应用程序。
     */
    public String authorize(String applicationId, String state, String version) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s?application_id=%s&state=%s", AUTHORIZE_URL, applicationId, state));
        if (ObjectUtils.isEmpty(version)) {
            sb.append(String.format("&version=%s", version));
        }
        return sb.toString();
    }


    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/website-authorization-workflow">授权码模式获取accessToken</a>
     *
     * @param clientId     客户端Id
     * @param clientSecret 客户端密钥
     * @param code         授权码
     * @param redirectUri  重定向地址
     */
    public AmazonToken accessToken(String clientId, String clientSecret, String code, String redirectUri) {
        HttpHeaders headers = getBasicHeaders(clientId, clientSecret);
        ResponseEntity<AmazonToken> exchange = restOperations.exchange(URI.create(String.format("%s?grant_type=authorization_code&code=%s&redirect_uri=%s", TOKEN_URL, code, redirectUri)), HttpMethod.POST, new HttpEntity<>(null, headers), AmazonToken.class);
        return exchange.getBody();
    }


    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/orders-api-v0-reference#get-ordersv0ordersorderid">获取订单</a>
     *
     * @param orderId 亚马逊订单ID
     */
    public AmazonResponse<AmazonOrder> getOrder(String orderId, String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-amz-access-token", accessToken);
        return restOperations.exchange(URI.create(String.format("%s/orders/v0/orders/%s?MarketplaceId=ATVPDKIKX0DER", SELLING_PARTNER_HOST, orderId)), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<AmazonResponse<AmazonOrder>>() {
        }).getBody();
    }

    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/orders-api-v0-reference#get-ordersv0orders">获取订单列表</a>
     */
    public AmazonResponse<AmazonOrder> getOrders(OrdersDTO dto) {
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/orders/v0/orders", SELLING_PARTNER_HOST));
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        builder.queryParams(req);
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, new HttpHeaders()), new ParameterizedTypeReference<AmazonResponse<AmazonOrder>>() {
        }).getBody();
    }

    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/orders-api-v0-reference#get-ordersv0ordersorderidbuyerinfo">获取订单购买信息</a>
     *
     * @param orderId 亚马逊订单ID
     */
    public AmazonResponse<AmazonBuyerInfo> orderBuyerInfo(String orderId, String nextToken) {
        return restOperations.exchange(URI.create(String.format("%s/orders/v0/orders/%s/buyerInfo?nextToken=%s", SELLING_PARTNER_HOST, orderId, nextToken)), HttpMethod.GET, new HttpEntity<>(null, new HttpHeaders()), new ParameterizedTypeReference<AmazonResponse<AmazonBuyerInfo>>() {
        }).getBody();
    }

    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/orders-api-v0-reference#get-ordersv0ordersorderidaddress">获取订单地址信息</a>
     *
     * @param orderId 亚马逊订单ID
     */
    public AmazonResponse<AmazonShippingAddress> orderAddress(String orderId, String nextToken) {
        return restOperations.exchange(URI.create(String.format("%s/orders/v0/orders/%s/address?nextToken=%s", SELLING_PARTNER_HOST, orderId, nextToken)), HttpMethod.GET, new HttpEntity<>(null, new HttpHeaders()), new ParameterizedTypeReference<AmazonResponse<AmazonShippingAddress>>() {
        }).getBody();
    }

    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/orders-api-v0-reference#get-ordersv0ordersorderidorderitems">获取订单Item列表</a>
     */
    public AmazonResponse<AmazonOrderItems> getOrderItems(String orderId, String nextToken) {
        return restOperations.exchange(URI.create(String.format("%s/orders/v0/orders/%s/orderItems?nextToken=%s", SELLING_PARTNER_HOST, orderId, nextToken)), HttpMethod.GET, new HttpEntity<>(null, new HttpHeaders()), new ParameterizedTypeReference<AmazonResponse<AmazonOrderItems>>() {
        }).getBody();
    }


    /**
     * <a href="https://developer-docs.amazon.com/sp-api/docs/orders-api-v0-reference#post-ordersv0ordersorderidshipment">更新发货状态</a>
     */
    public void shipment(String orderId, String nextToken, ShipmentDTO dto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ShipmentDTO> httpEntity = new HttpEntity<>(dto, headers);
        restOperations.exchange(URI.create(String.format("%s/orders/v0/orders/%s/shipment?nextToken=%s", SELLING_PARTNER_HOST, orderId, nextToken)), HttpMethod.POST, httpEntity, Void.class);
    }

}
