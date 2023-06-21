package io.github.ealenxie.allegro;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.dto.*;
import io.github.ealenxie.allegro.vo.*;
import io.github.ealenxie.allegro.vo.checkoutform.CheckoutForm;
import io.github.ealenxie.allegro.vo.orderevent.OrderEvent;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Created by EalenXie on 2022/2/21 12:59
 * <a href="https://developer.allegro.pl/documentation">Allegro REST API </a>
 * <a href="https://developer.allegro.pl/documentation/#tag/Order-management">订单接口文档</a>
 */

public class AllegroOrderClient extends AllegroClient {

    private final ObjectMapper mapper;


    public AllegroOrderClient() {
        this(new RestTemplate());
    }

    public AllegroOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public AllegroOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(restOperations);
        this.mapper = objectMapper;
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfOrdersUsingGET">获取用户订单</a>
     *
     * @param dto         用户订单查询参数
     * @param accessToken 令牌
     * @return {@link CheckoutForms} 订单详情
     */
    public CheckoutForms userOrders(OrdersDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/checkout-forms", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<CheckoutForms> exchange = getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), CheckoutForms.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrdersDetailsUsingGET">获取订单详情</a>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     * @return {@link CheckoutForm} 订单详情
     */
    public CheckoutForm ordersDetails(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<CheckoutForm> exchange = getRestOperations().exchange(URI.create(String.format("%s/order/checkout-forms/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId)), HttpMethod.GET, new HttpEntity<>(null, headers), CheckoutForm.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createOrderShipmentsUsingPOST">订单标记发货</a>
     *
     * @param orderId     订单Id
     * @param dto         标记发货请求参数
     * @param accessToken 请求token
     * @return {@link Shipment} 标记发货
     */
    public Shipment shipments(String orderId, ShipmentDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        HttpEntity<ShipmentDTO> mapHttpEntity = new HttpEntity<>(dto, headers);
        ResponseEntity<Shipment> exchange = getRestOperations().exchange(String.format("%s/order/checkout-forms/%s/shipments", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), HttpMethod.POST, mapHttpEntity, Shipment.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderShipmentsUsingGET">获取物流追踪号</a>
     *
     * @param orderId     订单Id
     * @param accessToken 请求token
     * @return {@link Shipment} 物流返回对象
     */
    public Shipment shipments(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<Shipment> exchange = getRestOperations().exchange(String.format("%s/order/checkout-forms/%s/shipments", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), HttpMethod.GET, new HttpEntity<>(null, headers), Shipment.class);
        return exchange.getBody();
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderEventsUsingGET">获取订单事件查询</a>
     *
     * @param dto         事件查询参数
     * @param accessToken 请求token
     * @return {@link OrderEvent}
     */
    public OrderEvent events(OrderEventDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/events", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        ResponseEntity<OrderEvent> exchange = getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), OrderEvent.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderEventsStatisticsUsingGET">获取订单事件统计</a>
     *
     * @param accessToken 请求token
     * @return {@link EventStats}
     */
    public EventStats eventStats(String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<EventStats> exchange = getRestOperations().exchange(String.format("%s/order/event-stats", isSandBox() ? API_SANDBOX_HOST : API_HOST), HttpMethod.GET, new HttpEntity<>(null, headers), EventStats.class);
        return exchange.getBody();
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrdersCarriersUsingGET">获取订单物流</a>
     *
     * @param accessToken 请求token
     * @return {@link OrderCarriers} 订单物流信息
     */
    public OrderCarriers orderCarriers(String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<OrderCarriers> exchange = getRestOperations().exchange(String.format("%s/order/carriers", isSandBox() ? API_SANDBOX_HOST : API_HOST), HttpMethod.GET, new HttpEntity<>(null, headers), OrderCarriers.class);
        return exchange.getBody();
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/setOrderFulfillmentUsingPUT">修改订单状态</a>
     *
     * @param orderId     订单Id
     * @param dto         修改订单状态请求参数
     * @param accessToken 请求token
     */
    public void fulfillment(String orderId, FulfillmentDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        getRestOperations().put(String.format("%s/order/checkout-forms/%s/fulfillment", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), new HttpEntity<>(dto, headers));
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderInvoicesDetails">获取订单发票详细信息</a>
     *
     * @param orderId     订单Id
     * @param accessToken 请求token
     * @return {@link Invoices} 发票
     */
    public Invoices invoices(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<Invoices> exchange = getRestOperations().exchange(String.format("%s/order/checkout-forms/%s/invoices", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), HttpMethod.GET, new HttpEntity<>(null, headers), Invoices.class);
        return exchange.getBody();
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/addOrderInvoicesMetadata">创建发票</a>
     *
     * @param orderId     订单Id
     * @param dto         发票请求参数
     * @param accessToken 请求token
     * @return {@link IdVO} IdVO
     */
    public IdVO invoices(String orderId, InvoicesDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        String url = String.format("%s/order/checkout-forms/%s/invoices", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId);
        ResponseEntity<IdVO> exchange = getRestOperations().exchange(URI.create(url), HttpMethod.POST, new HttpEntity<>(dto, headers), IdVO.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadOrderInvoiceFile">上传发票</a>
     *
     * @param orderId   订单Id
     * @param file      发票文件
     * @param invoiceId 发票id
     */
    public void putInvoices(String orderId, String invoiceId, byte[] file, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        String url = String.format("%s/order/checkout-forms/%s/invoices/%s/file", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId, invoiceId);
        getRestOperations().exchange(URI.create(url), HttpMethod.PUT, new HttpEntity<>(file, headers), String.class);
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingEntries">获取账单条目列表</a>
     */
    public BillingVO billings(BillingDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/billing/billing-entries", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        ResponseEntity<BillingVO> exchange = getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), BillingVO.class);
        return exchange.getBody();
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingTypes">获取费用类型</a>
     */
    public List<BillingTypeVO> billingsType(String token, BillingTypeDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/billing/billing-types", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        ResponseEntity<String> exchange = getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), String.class);
        return readAllegroBody(exchange.getBody(), new TypeReference<List<BillingTypeVO>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation#operation/getAllegroParcelTrackingUsingGET">查询支付历史</a>
     *
     * @param token 授权
     * @param dto   请求参数
     */
    public PaymentOperations payments(String token, PaymentsDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/payments/payment-operations", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), PaymentOperations.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/initiateRefund">发起退款</a>
     *
     * @param token 授权
     * @param dto   请求参数
     */
    public InitiateRefundVO initiateRefund(String token, InitiateRefundDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/payments/refunds", isSandBox() ? API_SANDBOX_HOST : API_HOST);
        return getRestOperations().exchange(URI.create(url), HttpMethod.POST, new HttpEntity<>(dto, headers), InitiateRefundVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#tag/Disputes">获取用户的纠纷</a>
     *
     * @param token 授权
     * @param dto   请求参数
     */
    public DisputesVO disputes(String token, DisputesDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/sale/disputes", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), DisputesVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#tag/Disputes">获取争议中的消息</a>
     *
     * @param token     授权
     * @param disputeId 争议id
     */
    public Messages getMessages(String token, String disputeId, GetMessagesDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/sale/disputes/%s/messages", isSandBox() ? API_SANDBOX_HOST : API_HOST, disputeId));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), Messages.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadDisputeAttachmentUsingPUT">上传争议邮件附件</a>
     *
     * @param token        授权
     * @param attachmentId 附件标识符
     */
    public void uploadAttachment(String token, String attachmentId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/sale/dispute-attachments/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, attachmentId);
        getRestOperations().put(URI.create(url), new HttpEntity<>(null, headers));
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAttachmentUsingGET">获取争议邮件附件</a>
     *
     * @param token        授权
     * @param attachmentId 附件标识符
     */
    public byte[] getAttachment(String token, String attachmentId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/sale/dispute-attachments/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, attachmentId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), byte[].class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAvailableDeliveryServices">Get available delivery services/获得可用的送货服务</a>
     *
     * @param token 授权
     */
    public DeliveryServicesVO getAvailableDeliveryServices(String token) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/delivery-services", isSandBox() ? API_SANDBOX_HOST : API_HOST);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), DeliveryServicesVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createNewParcel">Create a new parcel/创建一个新的包裹</a>
     *
     * @param token 授权
     */
    public CreateNewParcelVO createNewParcel(String token, String commandId, CreateNewParcelDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcel-create-commands/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, commandId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.PUT, new HttpEntity<>(dto, headers), CreateNewParcelVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelCreationStatus">Get parcel creation status/获取包创建状态</a>
     *
     * @param token     授权
     * @param commandId Command UUID
     */
    public GetParcelCreationStatusVO getParcelCreationStatus(String token, String commandId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcel-create-commands/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, commandId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), GetParcelCreationStatusVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelDetails">Get parcel details/获取包裹详情</a>
     *
     * @param token    授权
     * @param parcelId id of parcel 包裹Id
     */
    public GetParcelDetailsVO getParcelDetails(String token, String parcelId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcels/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, parcelId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), GetParcelDetailsVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelsPickupDateProposals">Get parcels pickup date proposals/获取包裹提货日期建议</a>
     *
     * @param token 授权
     * @param dto   包含:包裹Id和日期
     */
    public ProposalsVO getParcelsPickupDateProposals(String token, ProposalsDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/parcel-management/parcels/pickup-date-proposals", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), ProposalsVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/requestParcelPickup">Request parcel pickup/申请取件</a>
     *
     * @param token 授权
     * @param dto   包含包裹Id和日期
     */
    public RequestParcelPickupVO requestParcelPickup(String token, String commandId, RequestParcelPickupDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcel-pickup-request-commands/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, commandId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.PUT, new HttpEntity<>(dto, headers), RequestParcelPickupVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelPickupStatus">Get parcel pickup status/获取包裹提货状态</a>
     *
     * @param token     授权
     * @param commandId 包含包裹Id和日期
     */
    public GetParcelPickupStatusVO getParcelPickupStatus(String token, String commandId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcel-pickup-request-commands/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, commandId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), GetParcelPickupStatusVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelLabel">Get parcel label/领取包裹标签</a>
     *
     * @param token 授权
     * @param dto   请求参数
     */
    public byte[] getParcelLabel(String token, GetParcelLabelDTO dto) {
        HttpHeaders headers = getBearerHeaders(token);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/parcel-management/parcels/label", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);

        return getRestOperations().exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), byte[].class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelsProtocol">Get parcels protocol/领取包裹协议</a>
     *
     * @param token    授权
     * @param parcelId 请求参数
     */
    public byte[] getParcelsProtocol(String token, String parcelId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcels/protocol/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, parcelId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), byte[].class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/cancelParcel">Cancel parcel/取消包裹</a>
     *
     * @param token     授权
     * @param parcelId  请求参数
     * @param commandId 请求参数
     */
    public CancelParcelVO cancelParcel(String token, String parcelId, String commandId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcel-cancel-commands/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, commandId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.PUT, new HttpEntity<>(parcelId, headers), CancelParcelVO.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelCancellationStatus">Get parcel cancellation status/获取包裹取消状态</a>
     *
     * @param token     授权
     * @param commandId 请求参数
     */
    public CancelParcelVO getParcelCancellationStatus(String token, String commandId) {
        HttpHeaders headers = getBearerHeaders(token);
        String url = String.format("%s/parcel-management/parcel-cancel-commands/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, commandId);
        return getRestOperations().exchange(URI.create(url), HttpMethod.GET, new HttpEntity<>(null, headers), CancelParcelVO.class).getBody();
    }

    @SuppressWarnings("all")
    public LinkedMultiValueMap<String, String> getQueryParams(Object dto) {
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        return req;
    }


    public <T> T readAllegroBody(String body, TypeReference<T> valueTypeRef) {
        try {
            return mapper.readValue(body, valueTypeRef);
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
