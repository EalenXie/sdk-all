package io.github.ealenxie.allegro;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.order.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/21 12:59
 * <a href="https://developer.allegro.pl/documentation">Allegro REST API </a>
 * <a href="https://developer.allegro.pl/documentation/#tag/Order-management">订单接口文档</a>
 */

public class AllegroOrderClient extends AllegroClient {

    public AllegroOrderClient() {
        this(new RestTemplate());
    }

    public AllegroOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public AllegroOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderEventsUsingGET">获取订单事件查询</a>
     *
     * @param queryParams 事件查询参数
     * @param accessToken 请求token
     */
    public OrderEvent events(String accessToken, OrderEventQueryParams queryParams) {
        return getAllegro("/order/events", accessToken, queryParams, OrderEvent.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderEventsStatisticsUsingGET">获取订单事件统计</a>
     *
     * @param accessToken 请求token
     */
    public EventStats eventStats(String accessToken) {
        return getAllegro("/order/event-stats", accessToken, null, EventStats.class);
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfOrdersUsingGET">获取用户订单</a>
     *
     * @param accessToken 令牌
     * @param queryParams 用户订单查询参数
     */
    public CheckoutForms userOrders(String accessToken, OrdersQueryParams queryParams) {
        return getAllegro("/order/checkout-forms", accessToken, queryParams, CheckoutForms.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrdersDetailsUsingGET">获取订单详情</a>
     *
     * @param accessToken 令牌
     * @param orderId     订单Id
     * @return {@link CheckoutForm} 订单详情
     */
    public CheckoutForm ordersDetails(String accessToken, String orderId) {
        return getAllegro(String.format("/order/checkout-forms/%s", orderId), accessToken, null, CheckoutForm.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createOrderShipmentsUsingPOST">订单标记发货</a>
     *
     * @param orderId     订单Id
     * @param payload     标记发货请求参数
     * @param accessToken 请求token
     * @return {@link Shipment} 标记发货
     */
    public Shipment shipments(String accessToken, String orderId, ShipmentPayload payload) {
        return postAllegro(String.format("/order/checkout-forms/%s/shipments", orderId), accessToken, payload, Shipment.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderShipmentsUsingGET">获取物流追踪号</a>
     *
     * @param orderId     订单Id
     * @param accessToken 请求token
     * @return {@link Shipment} 物流返回对象
     */
    public Shipment shipments(String accessToken, String orderId) {
        return getAllegro(String.format("/order/checkout-forms/%s/shipments", orderId), accessToken, null, Shipment.class);
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrdersCarriersUsingGET">获取订单物流</a>
     *
     * @param accessToken 请求token
     * @return {@link OrderCarriers} 订单物流信息
     */
    public OrderCarriers orderCarriers(String accessToken) {
        return getAllegro("/order/carriers", accessToken, null, OrderCarriers.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/setOrderFulfillmentUsingPUT">修改订单状态</a>
     *
     * @param orderId     订单Id
     * @param payload     修改订单状态请求参数
     * @param accessToken 请求token
     */
    public void fulfillment(String accessToken, String orderId, FulfillmentPayload payload) {
        exchangeAllegro(String.format("/order/checkout-forms/%s/fulfillment", orderId), HttpMethod.PUT, accessToken, null, payload, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderInvoicesDetails">获取订单发票详细信息</a>
     *
     * @param orderId     订单Id
     * @param accessToken 请求token
     */
    public InvoicesResponse invoices(String accessToken, String orderId) {
        return getAllegro(String.format("/order/checkout-forms/%s/invoices", orderId), accessToken, null, InvoicesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/addOrderInvoicesMetadata">创建发票</a>
     *
     * @param orderId     订单Id
     * @param payload     发票请求参数
     * @param accessToken 请求token
     */
    public IdPayload invoices(String accessToken, String orderId, InvoicesPayload payload) {
        return postAllegro(String.format("/order/checkout-forms/%s/invoices", orderId), accessToken, payload, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadOrderInvoiceFile">上传发票</a>
     *
     * @param orderId   订单Id
     * @param file      发票文件
     * @param invoiceId 发票id
     */
    public void putInvoices(String accessToken, String orderId, String invoiceId, byte[] file) {
        exchangeAllegro(String.format("/order/checkout-forms/%s/invoices/%s/file", orderId, invoiceId), HttpMethod.PUT, accessToken, null, file, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingEntries">获取账单条目列表</a>
     */
    public BillingEntriesResponse billings(String accessToken, BillingQueryParams queryParams) {
        return getAllegro("/billing/billing-entries", accessToken, queryParams, BillingEntriesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingTypes">获取费用类型</a>
     */
    public List<BillingTypePayload> billingsType(String accessToken, BillingTypeQueryParams queryParams) {
        return getAllegro("/billing/billing-types", accessToken, queryParams, new ParameterizedTypeReference<List<BillingTypePayload>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation#operation/getAllegroParcelTrackingUsingGET">查询支付历史</a>
     *
     * @param accessToken 授权
     * @param queryParams 请求参数
     */
    public PaymentOperationsResponse payments(String accessToken, PaymentsQueryParams queryParams) {
        return getAllegro("/payments/payment-operations", accessToken, queryParams, PaymentOperationsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/initiateRefund">发起退款</a>
     *
     * @param accessToken 授权
     * @param payload     请求参数
     */
    public InitiateRefundResponse initiateRefund(String accessToken, InitiateRefundPayload payload) {
        return postAllegro("/payments/refunds", accessToken, payload, InitiateRefundResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#tag/Disputes">获取用户的纠纷</a>
     *
     * @param accessToken 授权
     * @param queryParams 请求参数
     */
    public DisputesResponse disputes(String accessToken, DisputesQueryParams queryParams) {
        return getAllegro("/sale/disputes", accessToken, queryParams, DisputesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#tag/Disputes">获取争议中的消息</a>
     *
     * @param accessToken 授权
     * @param disputeId   争议id
     */
    public Message getMessages(String accessToken, String disputeId, MessagesQueryParams queryParams) {
        return getAllegro(String.format("/sale/disputes/%s/messages", disputeId), accessToken, queryParams, Message.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadDisputeAttachmentUsingPUT">上传争议邮件附件</a>
     *
     * @param accessToken  授权
     * @param attachmentId 附件标识符
     */
    public void uploadAttachment(String accessToken, String attachmentId) {
        exchangeAllegro(String.format("/sale/dispute-attachments/%s", attachmentId), HttpMethod.PUT, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAttachmentUsingGET">获取争议邮件附件</a>
     *
     * @param accessToken  授权
     * @param attachmentId 附件标识符
     */
    public byte[] getAttachment(String accessToken, String attachmentId) {
        return getAllegro(String.format("/sale/dispute-attachments/%s", attachmentId), accessToken, null, byte[].class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAvailableDeliveryServices">Get available delivery services/获得可用的送货服务</a>
     *
     * @param accessToken 授权
     */
    public DeliveryServicesResponse getAvailableDeliveryServices(String accessToken) {
        return getAllegro("/parcel-management/delivery-services", accessToken, null, DeliveryServicesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createNewParcel">Create a new parcel/创建一个新的包裹</a>
     *
     * @param accessToken 授权
     * @param commandId   Command UUID.
     * @param payload     请求参数
     */
    public IdInputPayload<ParcelPayload> createNewParcel(String accessToken, String commandId, ParcelPayload payload) {
        return exchangeAllegro(String.format("/parcel-management/parcel-create-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<IdInputPayload<ParcelPayload>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelCreationStatus">Get parcel creation status/获取包创建状态</a>
     *
     * @param accessToken 授权
     * @param commandId   Command UUID
     */
    public ParcelCreationStatusResponse getParcelCreationStatus(String accessToken, String commandId) {
        return getAllegro(String.format("/parcel-management/parcel-create-commands/%s", commandId), accessToken, null, ParcelCreationStatusResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelDetails">Get parcel details/获取包裹详情</a>
     *
     * @param accessToken 授权
     * @param parcelId    id of parcel 包裹Id
     */
    public ParcelDetailsResponse getParcelDetails(String accessToken, String parcelId) {
        return getAllegro(String.format("/parcel-management/parcels/%s", parcelId), accessToken, null, ParcelDetailsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelsPickupDateProposals">Get parcels pickup date proposals/获取包裹提货日期建议</a>
     *
     * @param accessToken 授权
     * @param queryParams 请求参数
     */
    public ProposalsResponse getParcelsPickupDateProposals(String accessToken, ProposalsQueryParams queryParams) {
        return getAllegro("/parcel-management/parcels/pickup-date-proposals", accessToken, queryParams, ProposalsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/requestParcelPickup">Request parcel pickup/申请取件</a>
     *
     * @param accessToken 授权
     * @param payload     请求参数
     */
    public IdInputPayload<ParcelPickupPayload> requestParcelPickup(String accessToken, String commandId, ParcelPickupPayload payload) {
        return exchangeAllegro(String.format("/parcel-management/parcel-pickup-request-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<IdInputPayload<ParcelPickupPayload>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelPickupStatus">Get parcel pickup status/获取包裹提货状态</a>
     *
     * @param accessToken 授权
     * @param commandId   包含包裹Id和日期
     */
    public ParcelPickupStatusResponse getParcelPickupStatus(String accessToken, String commandId) {
        return getAllegro(String.format("/parcel-management/parcel-pickup-request-commands/%s", commandId), accessToken, null, ParcelPickupStatusResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelLabel">Get parcel label/领取包裹标签</a>
     *
     * @param accessToken 授权
     * @param queryParams 请求参数
     */
    public byte[] getParcelLabel(String accessToken, ParcelLabelQueryParams queryParams) {
        return getAllegro("/parcel-management/parcels/label", accessToken, queryParams, byte[].class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelsProtocol">Get parcels protocol/领取包裹协议</a>
     *
     * @param accessToken 授权
     * @param parcelId    请求参数
     */
    public byte[] getParcelsProtocol(String accessToken, String parcelId) {
        return getAllegro(String.format("/parcel-management/parcels/protocol/%s", parcelId), accessToken, null, byte[].class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/cancelParcel">Cancel parcel/取消包裹</a>
     *
     * @param accessToken 授权
     * @param parcelId    请求参数
     * @param commandId   请求参数
     */
    public IdInputPayload<ParcelIdPayload> cancelParcel(String accessToken, String parcelId, String commandId) {
        return exchangeAllegro(String.format("/parcel-management/parcel-cancel-commands/%s", commandId), HttpMethod.PUT, accessToken, null, new ParcelIdPayload(parcelId), new ParameterizedTypeReference<IdInputPayload<ParcelIdPayload>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelCancellationStatus">Get parcel cancellation status/获取包裹取消状态</a>
     *
     * @param accessToken 授权
     * @param commandId   请求参数
     */
    public IdInputPayload<ParcelIdPayload> getParcelCancellationStatus(String accessToken, String commandId) {
        return getAllegro(String.format("/parcel-management/parcel-cancel-commands/%s", commandId), accessToken, null, new ParameterizedTypeReference<IdInputPayload<ParcelIdPayload>>() {
        });
    }

}
