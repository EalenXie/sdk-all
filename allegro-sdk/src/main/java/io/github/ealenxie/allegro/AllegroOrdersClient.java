package io.github.ealenxie.allegro;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.order.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/21 12:59
 * <a href="https://developer.allegro.pl/documentation">Allegro REST API </a>
 */
public class AllegroOrdersClient extends AllegroClient {

    public AllegroOrdersClient() {
        this(new RestTemplate());
    }

    public AllegroOrdersClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public AllegroOrdersClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderEventsUsingGET">Get order events</a>
     *
     * @param queryParams 查询参数
     * @param accessToken accessToken
     */
    public OrderEvent events(String accessToken, OrderEventQueryParams queryParams) {
        return getAllegro("/order/events", accessToken, queryParams, OrderEvent.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderEventsStatisticsUsingGET">Get order events statistics</a>
     *
     * @param accessToken accessToken
     */
    public EventStats eventStats(String accessToken) {
        return getAllegro("/order/event-stats", accessToken, null, EventStats.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfOrdersUsingGET">Get the user's orders</a>
     *
     * @param accessToken 令牌
     * @param queryParams 用户订单查询参数
     */
    public CheckoutForms userOrders(String accessToken, OrdersQueryParams queryParams) {
        return getAllegro("/order/checkout-forms", accessToken, queryParams, CheckoutForms.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrdersDetailsUsingGET">Get an order's details</a>
     *
     * @param accessToken 令牌
     * @param orderId     订单Id
     */
    public CheckoutForm ordersDetails(String accessToken, String orderId) {
        return getAllegro(String.format("/order/checkout-forms/%s", orderId), accessToken, null, CheckoutForm.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrdersCarriersUsingGET">Get a list of available shipping carriers</a>
     *
     * @param accessToken accessToken
     */
    public OrderCarriers orderCarriers(String accessToken) {
        return getAllegro("/order/carriers", accessToken, null, OrderCarriers.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderShipmentsUsingGET">Get a list of parcel tracking numbers</a>
     *
     * @param orderId     订单Id
     * @param accessToken accessToken
     */
    public Shipment getShipment(String accessToken, String orderId) {
        return getAllegro(String.format("/order/checkout-forms/%s/shipments", orderId), accessToken, null, Shipment.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createOrderShipmentsUsingPOST">Add a parcel tracking number</a>
     *
     * @param orderId     订单Id
     * @param payload     请求参数
     * @param accessToken accessToken
     */
    public Shipment shipments(String accessToken, String orderId, ShipmentPayload payload) {
        return postAllegro(String.format("/order/checkout-forms/%s/shipments", orderId), accessToken, payload, Shipment.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/setOrderFulfillmentUsingPUT">Set seller order status</a>
     *
     * @param orderId     订单Id
     * @param payload     请求参数
     * @param accessToken accessToken
     */
    public void fulfillment(String accessToken, String orderId, FulfillmentPayload payload) {
        exchangeAllegro(String.format("/order/checkout-forms/%s/fulfillment", orderId), HttpMethod.PUT, accessToken, null, payload, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOrderInvoicesDetails">Get order invoices details</a>
     *
     * @param orderId     订单Id
     * @param accessToken accessToken
     */
    public InvoicesResponse invoices(String accessToken, String orderId) {
        return getAllegro(String.format("/order/checkout-forms/%s/invoices", orderId), accessToken, null, InvoicesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/addOrderInvoicesMetadata">Post new invoice</a>
     *
     * @param orderId     订单Id
     * @param payload     发票请求参数
     * @param accessToken accessToken
     */
    public IdPayload newInvoice(String accessToken, String orderId, InvoicesPayload payload) {
        return postAllegro(String.format("/order/checkout-forms/%s/invoices", orderId), accessToken, payload, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadOrderInvoiceFile">Upload invoice file</a>
     *
     * @param orderId   订单Id
     * @param file      发票文件
     * @param invoiceId 发票id
     */
    public void uploadInvoiceFile(String accessToken, String orderId, String invoiceId, byte[] file) {
        exchangeAllegro(String.format("/order/checkout-forms/%s/invoices/%s/file", orderId, invoiceId), HttpMethod.PUT, accessToken, null, file, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAllegroPickupDropOffPointsGET">Get Allegro pickup drop off points</a>
     *
     * @param accessToken accessToken
     */
    public CarriersPointsResponse carriersPoints(String accessToken) {
        return getAllegro("/order/carriers/ALLEGRO/points", accessToken, null, CarriersPointsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelTrackingUsingGET">Get carrier parcel tracking history</a>
     *
     * @param accessToken accessToken
     * @param carrierId   carrierId
     * @param waybill     waybill
     */
    public CarriersTrackingResponse carriersTracking(String accessToken, String carrierId, List<String> waybill) {
        return getAllegro(String.format("/order/carriers/%s/tracking", carrierId), accessToken, new CarriersTrackingQueryParams(waybill), CarriersTrackingResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation#operation/getPaymentsOperationHistory">Payment operations history</a>
     *
     * @param accessToken accessToken
     * @param queryParams 请求参数
     */
    public PaymentOperationsResponse paymentOperations(String accessToken, PaymentsQueryParams queryParams) {
        return getAllegro("/payments/payment-operations", accessToken, queryParams, PaymentOperationsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/initiateRefund">Initiate a refund of a payment</a>
     *
     * @param accessToken accessToken
     * @param payload     请求参数
     */
    public InitiateRefundResponse initiateRefund(String accessToken, InitiateRefundPayload payload) {
        return postAllegro("/payments/refunds", accessToken, payload, InitiateRefundResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getRefundedPayments">Get a list of refunded payments</a>
     *
     * @param accessToken accessToken
     * @param queryParams 请求参数
     */
    public RefundedPaymentsResponse getRefundedPayments(String accessToken, RefundedPaymentsQueryParams queryParams) {
        return getAllegro("/payments/refunds", accessToken, queryParams, RefundedPaymentsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfDisputesUsingGET">Get the user's disputes</a>
     *
     * @param accessToken accessToken
     * @param queryParams 请求参数
     */
    public DisputesResponse disputes(String accessToken, DisputesQueryParams queryParams) {
        return getAllegro("/sale/disputes", accessToken, queryParams, DisputesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getDisputeUsingGET">Get a single dispute</a>
     *
     * @param accessToken accessToken
     * @param disputeId   disputeId
     */
    public Dispute dispute(String accessToken, String disputeId) {
        return getAllegro(String.format("/sale/disputes/%s", disputeId), accessToken, null, Dispute.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getMessagesFromDisputeUsingGET">Get the messages within a dispute</a>
     *
     * @param accessToken accessToken
     * @param disputeId   disputeId
     */
    public Message getDisputeMessages(String accessToken, String disputeId, PageQueryParams queryParams) {
        return getAllegro(String.format("/sale/disputes/%s/messages", disputeId), accessToken, queryParams, Message.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/addMessageToDisputeUsingPOST">Add a message to a dispute</a>
     *
     * @param accessToken accessToken
     * @param disputeId   disputeId
     */
    public Message addMessageToDispute(String accessToken, String disputeId, AddMessageToDisputePayload payload) {
        return postAllegro(String.format("/sale/disputes/%s/messages", disputeId), accessToken, payload, Message.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAnAttachmentUsingPOST">Create an attachment declaration</a>
     *
     * @param accessToken accessToken
     * @param payload     请求参数
     */
    public IdPayload createAnAttachment(String accessToken, CreateAttachmentPayload payload) {
        return postAllegro("/sale/dispute-attachments", accessToken, payload, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadDisputeAttachmentUsingPUT">上传争议邮件附件</a>
     *
     * @param accessToken  授权
     * @param attachmentId 附件标识符
     * @param file         文件
     */
    public void uploadDisputeAttachment(String accessToken, String attachmentId, byte[] file) {
        exchangeAllegro(buildUri(getUploadHost(), String.format("/sale/dispute-attachments/%s", attachmentId), null), HttpMethod.PUT, new HttpEntity<>(file, getBearerHeaders(accessToken)), Object.class);
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
     * <a href="https://developer.allegro.pl/documentation/#operation/getAvailableDeliveryServices">Get available delivery services</a>
     *
     * @param accessToken accessToken
     */
    public DeliveryServicesResponse getAvailableDeliveryServices(String accessToken) {
        return getAllegro("/parcel-management/delivery-services", accessToken, null, DeliveryServicesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createNewParcel">Create a new parcel</a>
     *
     * @param accessToken accessToken
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
     * @param accessToken accessToken
     * @param commandId   Command UUID
     */
    public ParcelCreationStatusResponse getParcelCreationStatus(String accessToken, String commandId) {
        return getAllegro(String.format("/parcel-management/parcel-create-commands/%s", commandId), accessToken, null, ParcelCreationStatusResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelDetails">Get parcel details</a>
     *
     * @param accessToken accessToken
     * @param parcelId    id of parcel 包裹Id
     */
    public ParcelDetailsResponse getParcelDetails(String accessToken, String parcelId) {
        return getAllegro(String.format("/parcel-management/parcels/%s", parcelId), accessToken, null, ParcelDetailsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelsPickupDateProposals">Get parcels pickup date proposals</a>
     *
     * @param accessToken accessToken
     * @param queryParams 请求参数
     */
    public ProposalsResponse getParcelsPickupDateProposals(String accessToken, ProposalsQueryParams queryParams) {
        return getAllegro("/parcel-management/parcels/pickup-date-proposals", accessToken, queryParams, ProposalsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/requestParcelPickup">Request parcel pickup</a>
     *
     * @param accessToken accessToken
     * @param payload     请求参数
     */
    public IdInputPayload<ParcelPickupPayload> requestParcelPickup(String accessToken, String commandId, ParcelPickupPayload payload) {
        return exchangeAllegro(String.format("/parcel-management/parcel-pickup-request-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<IdInputPayload<ParcelPickupPayload>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelPickupStatus">Get parcel pickup status</a>
     *
     * @param accessToken accessToken
     * @param commandId   包含包裹Id和日期
     */
    public ParcelPickupStatusResponse getParcelPickupStatus(String accessToken, String commandId) {
        return getAllegro(String.format("/parcel-management/parcel-pickup-request-commands/%s", commandId), accessToken, null, ParcelPickupStatusResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelLabel">Get parcel label</a>
     *
     * @param accessToken accessToken
     * @param queryParams 请求参数
     */
    public byte[] getParcelLabel(String accessToken, ParcelLabelQueryParams queryParams) {
        return getAllegro("/parcel-management/parcels/label", accessToken, queryParams, byte[].class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelsProtocol">Get parcels protocol</a>
     *
     * @param accessToken accessToken
     * @param parcelId    请求参数
     */
    public byte[] getParcelsProtocol(String accessToken, String parcelId) {
        return getAllegro(String.format("/parcel-management/parcels/protocol/%s", parcelId), accessToken, null, byte[].class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/cancelParcel">Cancel parcel</a>
     *
     * @param accessToken accessToken
     * @param parcelId    请求参数
     * @param commandId   请求参数
     */
    public IdInputPayload<ParcelIdPayload> cancelParcel(String accessToken, String parcelId, String commandId) {
        return exchangeAllegro(String.format("/parcel-management/parcel-cancel-commands/%s", commandId), HttpMethod.PUT, accessToken, null, new ParcelIdPayload(parcelId), new ParameterizedTypeReference<IdInputPayload<ParcelIdPayload>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getParcelCancellationStatus">Get parcel cancellation status</a>
     *
     * @param accessToken accessToken
     * @param commandId   请求参数
     */
    public IdInputPayload<ParcelIdPayload> getParcelCancellationStatus(String accessToken, String commandId) {
        return getAllegro(String.format("/parcel-management/parcel-cancel-commands/%s", commandId), accessToken, null, new ParameterizedTypeReference<IdInputPayload<ParcelIdPayload>>() {
        });
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCustomerReturns">[BETA] Get customer returns by provided query parameters</a>
     */
    public CustomerResponse getCustomerReturns(String accessToken, CustomerQueryParams queryParams) {
        return getAllegro("/order/customer-returns", accessToken, queryParams, CustomerResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCustomerReturnById">[BETA] Get customer return by id</a>
     */
    public CustomerReturns getCustomerReturnById(String accessToken, String customerReturnId) {
        return getAllegro(String.format("/order/customer-returns/%s", customerReturnId), accessToken, null, CustomerReturns.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/rejectCustomerReturnRefund">[BETA] Reject customer return refund</a>
     */
    public CustomerReturns rejectCustomerReturnRefund(String accessToken, String customerReturnId, Rejection payload) {
        return postAllegro(String.format("/order/customer-returns/%s/rejection", customerReturnId), accessToken, payload, CustomerReturns.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getRefundApplication">Get a refund application details</a>
     */
    public RefundPayload getRefundApplication(String accessToken, String claimId) {
        return getAllegro(String.format("/order/refund-claims/%s", claimId), accessToken, null, RefundPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/cancelRefundApplication">Cancel a refund application</a>
     */
    public void cancelRefundApplication(String accessToken, String claimId) {
        exchangeAllegro(String.format("/order/refund-claims/%s", claimId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getRefundApplications">Get a list of refund applications</a>
     */
    public RefundResponse getRefundApplications(String accessToken, RefundQueryParams queryParams) {
        return getAllegro("/order/refund-claims", accessToken, queryParams, RefundResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createRefundApplication">Create a refund application</a>
     */
    public IdPayload createRefundApplication(String accessToken, CreateRefundPayload payload) {
        return postAllegro("/order/refund-claims", accessToken, payload, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/doAddToBlackList">Add a users to the blacklist</a>
     */
    public BlackPayload addBlack(String accessToken, BlackPayload payload) {
        return postAllegro("/sale/blacklisted-users", accessToken, payload, BlackPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/doRemoveFromBlackList">Remove users from the blacklist</a>
     */
    public void removeBlack(String accessToken, String excludedUserId) {
        exchangeAllegro(String.format("/sale/blacklisted-users/%s", excludedUserId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }
}
