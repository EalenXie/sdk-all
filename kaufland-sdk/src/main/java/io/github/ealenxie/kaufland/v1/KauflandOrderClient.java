package io.github.ealenxie.kaufland.v1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.kaufland.KauflandClient;
import io.github.ealenxie.kaufland.v1.dto.InvoicesDTO;
import io.github.ealenxie.kaufland.v1.dto.OrdersDTO;
import io.github.ealenxie.kaufland.v1.dto.SendingOrdersDTO;
import io.github.ealenxie.kaufland.v1.vo.Order;
import io.github.ealenxie.kaufland.v1.vo.OrderUnit;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.List;

/**
 * @author jadechiang
 * @since 2022/08/12 12:45
 */
public class KauflandOrderClient extends KauflandClient {

    /**
     * <a href="https://sellerapi.kaufland.com/?page=orders#canceling-orders">Real</a>
     */
    public static final String API_HOST = "https://www.kaufland.de/api/v1";


    public KauflandOrderClient() {
        this(new RestTemplate());
    }

    public KauflandOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public KauflandOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(objectMapper, restOperations);
    }

    /**
     * 获取包含认证的 Real Bearer 标准请求头
     *
     * @param appKey    令牌
     * @param signature 签名
     */
    @SuppressWarnings("all")
    @Override
    public HttpHeaders getHeaders(String appKey, String signature, String timestamp) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("HM-Client", appKey);
        headers.add("HM-Signature", signature);
        headers.add("HM-Timestamp", timestamp);
        headers.add("User-Agent", DEFAULT_USER_AGENT);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return headers;
    }


    /**
     * <a href="https://www.kaufland.de/api/v1/?page=orders#retrieving-order-units">获取批量订单详情</a>
     *
     * @param appKey    appKey
     * @param secretKey 密钥
     */
    public ResponseEntity<List<OrderUnit>> getOrderUnits(String appKey, String secretKey, OrdersDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order-units/seller", API_HOST));
        LinkedMultiValueMap<String, String> req = queryParam(dto);
        builder.queryParams(req);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.GET, "", uri);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<List<OrderUnit>>() {
        });
    }

    /**
     * <a href="https://sellerapi.kaufland.com/?page=code-examples#adding-a-unit">获取订单</a>
     *
     * @param appKey    appKey
     * @param secretKey 密钥
     */
    public ResponseEntity<String> orders(String appKey, String secretKey, OrdersDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/orders/seller", API_HOST));
        LinkedMultiValueMap<String, String> req = queryParam(dto);
        builder.queryParams(req);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.GET, "", uri);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), String.class);
    }


    /**
     * <a href="https://www.kaufland.de/api/v1/?page=orders#retrieving-order-units">获取单条订单订单</a>
     *
     * @param appKey    appKey
     * @param secretKey 密钥
     */
    public ResponseEntity<Order> order(String appKey, String secretKey, String orderId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/orders/%s", API_HOST, orderId));
        builder.queryParam("embedded", "seller_units");
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.GET, "", uri);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), Order.class);
    }


    /**
     * <a href="https://www.kaufland.de/api/v1/?page=orders#sending-orders">标记发货</a>
     *
     * @param appKey    appKey
     * @param secretKey 密钥
     */
    public ResponseEntity<String> sendingOrders(SendingOrdersDTO dto, String appKey, String secretKey, String idOrderUnit) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order-units/%s/send/", API_HOST, idOrderUnit));
        URI uri = builder.build().encode().toUri();
        try {
            String param = getMapper().writeValueAsString(dto);
            HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.PATCH, param, uri);
            return getRestOperations().exchange(uri, HttpMethod.PATCH, new HttpEntity<>(param, headers), String.class);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * <a href="https://www.kaufland.de/api/v1/?page=order-invoices#upload-order-invoice">上传订单发票</a>
     */
    public ResponseEntity<String> uploadOrderInvoice(InvoicesDTO dto, String appKey, String secretKey) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order-invoices/", API_HOST));
        URI uri = builder.build().encode().toUri();
        // 转换参数
        try {
            String pdf = getMapper().writeValueAsString(dto);
            HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.POST, pdf, uri);
            return getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(pdf, headers), String.class);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }


    /**
     * <a href="https://www.kaufland.de/api/v1/?page=order-invoices#upload-order-invoice">查询订单发票</a>
     */
    public ResponseEntity<String> retrieving(String appKey, String secretKey, String orderId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/orders-invoices/%s", API_HOST, orderId));
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.GET, "", uri);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), String.class);
    }


    /**
     * <a href="https://www.kaufland.de/api/v1/?page=order-invoices#upload-order-invoice">查询批量订单发票</a>
     */
    public ResponseEntity<String> getInvoices(String appKey, String secretKey) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order-invoices/seller", API_HOST));
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.GET, "", uri);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), String.class);
    }


    /**
     * <a href="https://www.kaufland.de/api/v1/?page=inventory#deleting-units">删除发票</a>
     */
    public ResponseEntity<String> deleteInvoices(String appKey, String secretKey, String orderId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/units/%s", API_HOST, orderId));
        URI uri = builder.build().encode().toUri();
        HttpMethod delete = HttpMethod.DELETE;
        HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, delete, "", uri);
        return getRestOperations().exchange(uri, delete, new HttpEntity<>(null, headers), String.class);
    }
}
