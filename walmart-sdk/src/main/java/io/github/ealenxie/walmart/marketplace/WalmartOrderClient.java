package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.walmart.marketplace.dto.*;
import io.github.ealenxie.walmart.marketplace.vo.WalmartOrder;
import io.github.ealenxie.walmart.marketplace.vo.WalmartOrders;
import io.github.ealenxie.walmart.marketplace.vo.WalmartOrdersResp;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

/**
 * Created by EalenXie on 2022/3/16 14:02
 * <a href="https://developer.walmart.com/api/us/mp/orders">walmart 商户平台</a>
 */
public class WalmartOrderClient extends WalmartClient {

    private final ObjectMapper mapper;

    public WalmartOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public WalmartOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(restOperations);
        this.mapper = objectMapper;
    }

    public WalmartOrderClient(ObjectMapper objectMapper) {
        this.mapper = objectMapper;
    }


    /**
     * 获取包含认证信息,协议为application/json的 walmart 请求头
     *
     * @param clientId     客户端ID
     * @param clientSecret 客户端密钥
     * @param accessToken  访问令牌
     */
    public HttpHeaders getWalmartJsonHeaders(String clientId, String clientSecret, String accessToken) {
        HttpHeaders headers = getBasicHeaders(clientId, clientSecret);
        headers.set(WM_SEC_ACCESS_TOKEN, accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }


    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     * <p>获取订单</p>
     */
    public WalmartOrdersResp orders(BasicInfo basicInfo, String accessToken, OrdersDTO dto) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v3/orders", isSandBoxMode() ? SANDBOX_HOST : HOST));
        builder.queryParams(getQueryParams(dto));
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), WalmartOrdersResp.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     * <p>获取订单</p>
     */
    public WalmartOrders orders(BasicInfo basicInfo, String accessToken, String nextCursor) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v3/orders%s", isSandBoxMode() ? SANDBOX_HOST : HOST, nextCursor));
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), WalmartOrders.class).getBody();
    }


    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder">An order</a>
     * <p>根据订单号获取订单详情</p>
     */
    public WalmartOrder order(BasicInfo basicInfo, String accessToken, String purchaseOrderId) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        String url = String.format("%s/v3/orders/%s", isSandBoxMode() ? SANDBOX_HOST : HOST, purchaseOrderId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), WalmartOrder.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders">All released orders</a>
     * <p>获取所有已下达的订单</p>
     */
    public WalmartOrders releasedOrders(BasicInfo basicInfo, String accessToken) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        return getRestOperations().exchange(URI.create(String.format("%s/v3/orders/released", isSandBoxMode() ? SANDBOX_HOST : HOST)), HttpMethod.GET, new HttpEntity<>(null, headers), WalmartOrders.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines">Refund Order Lines</a>
     * <p>退款</p>
     */
    public WalmartOrder refund(String purchaseOrderId, BasicInfo basicInfo, String accessToken, RefundDTO dto) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        return getRestOperations().exchange(String.format("%s/v3/orders/%s/refund", isSandBoxMode() ? SANDBOX_HOST : HOST, purchaseOrderId), HttpMethod.POST, new HttpEntity<>(dto, headers), WalmartOrder.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates">Ship Order Lines</a>
     * <p>标记发货</p>
     */
    public String shipment(String purchaseOrderId, BasicInfo basicInfo, String accessToken, ShipmentDTO dto) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        return getRestOperations().exchange(String.format("%s/v3/orders/%s/shipping", isSandBoxMode() ? SANDBOX_HOST : HOST, purchaseOrderId), HttpMethod.POST, new HttpEntity<>(dto, headers), String.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders">Acknowledge Orders</a>
     * <p>确认订单</p>
     */
    public String acknowledge(String purchaseOrderId, BasicInfo basicInfo, String accessToken) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        return getRestOperations().exchange(String.format("%s/v3/orders/%s/acknowledge", isSandBoxMode() ? SANDBOX_HOST : HOST, purchaseOrderId), HttpMethod.POST, new HttpEntity<>(null, headers), String.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines">Cancel Order Lines</a>
     * <p>取消订单</p>
     */
    public WalmartOrder cancel(String purchaseOrderId, BasicInfo basicInfo, String accessToken, CancelDTO dto) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        return getRestOperations().exchange(String.format("%s/v3/orders/%s/cancel", isSandBoxMode() ? SANDBOX_HOST : HOST, purchaseOrderId), HttpMethod.POST, new HttpEntity<>(dto, headers), WalmartOrder.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports#operation/getAvailableV1ReconReportDates">获取对账报告日期</a>
     */
    public ReportDateDTO getReportDate(BasicInfo basicInfo, String accessToken) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v3/report/reconreport/availableReconFiles", isSandBoxMode() ? SANDBOX_HOST : HOST));
        LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("reportVersion", "v1");
        builder.queryParams(map);
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), ReportDateDTO.class).getBody();
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports#operation/getReconReportV1">下载结算报告(ZIP)</a>
     */
    public byte[] downloadReport(BasicInfo basicInfo, String accessToken, ReportDTO dto) {
        HttpHeaders headers = getWalmartJsonHeaders(basicInfo.getClientId(), basicInfo.getClientSecret(), accessToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_OCTET_STREAM));
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v3/report/reconreport/reconFile", isSandBoxMode() ? SANDBOX_HOST : HOST));
        builder.queryParams(getQueryParams(dto));
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), byte[].class).getBody();
    }

    /**
     * 将请求的DTO参数转化为 LinkedMultiValueMap 路径参数
     *
     * @param dto 请求DTO
     */
    public LinkedMultiValueMap<String, String> getQueryParams(Object dto) {
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        return req;
    }
}
