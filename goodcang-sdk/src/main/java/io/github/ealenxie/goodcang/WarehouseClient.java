package io.github.ealenxie.goodcang;

import io.github.ealenxie.goodcang.vo.ResponseAsk;
import io.github.ealenxie.goodcang.vo.ResponsePage;
import io.github.ealenxie.goodcang.warehouse.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 17:38
 * 海外仓配
 */
public class WarehouseClient extends GoodCangClient {


    public WarehouseClient(String appKey, String appToken) {
        this(new RestTemplate(), appKey, appToken);
    }

    public WarehouseClient(RestOperations restOperations, String appKey, String appToken) {
        super(appKey, appToken, restOperations);
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_vat_list">进出口商列表</a>
     */
    public ResponseAsk<List<Vat>> getInboundOrderVatList(PagePayload payload) {
        return postGoodCang("/inbound_order/get_vat_list", payload, new ParameterizedTypeReference<ResponseAsk<List<Vat>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_smcode_twc_to_warehouse">获取物流产品与目的仓中转仓</a>
     */
    public ResponseAsk<SmCodeTwcToWarehouseResponse> getSmCodeTwcToWarehouse() {
        return postGoodCang("/inbound_order/get_smcode_twc_to_warehouse", null, new ParameterizedTypeReference<ResponseAsk<SmCodeTwcToWarehouseResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/create_grn">创建入库单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReceivingCodePayload> createGrn(CreateGrnPayload payload) {
        return postGoodCang("/inbound_order/create_grn", payload, new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/modify_grn">编辑入库单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReceivingCodePayload> modifyGrn(ModifyGrnPayload payload) {
        return postGoodCang("/inbound_order/modify_grn", payload, new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/del_grn">废弃入库单</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<ReceivingCodePayload> delGrn(String receivingCode) {
        return postGoodCang("/inbound_order/del_grn", new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_grn_list">获取入库单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<GrnInfo>> getGrnList(GrnListPayload payload) {
        return postGoodCang("/inbound_order/get_grn_list", payload, new ParameterizedTypeReference<ResponsePage<List<GrnInfo>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_grn_detail">获取入库单明细</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<GrnDetail> getGrnDetail(String receivingCode) {
        return postGoodCang("/inbound_order/get_grn_detail", new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<GrnDetail>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/del_asn_box">删除入库单箱唛</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<String>> delAsnBox(DelAsnBoxPayload payload) {
        return postGoodCang("/inbound_order/del_asn_box", payload, new ParameterizedTypeReference<ResponseAsk<List<String>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/print_gc_receiving_box">打印箱唛</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ImageResponse> printGcReceivingBox(PrintGcReceivingBoxPayload payload) {
        return postGoodCang("/inbound_order/print_gc_receiving_box", payload, new ParameterizedTypeReference<ResponseAsk<ImageResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_batch">获取上架批次</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<List<PutawayResponse>> getBatch(String receivingCode) {
        return postGoodCang("/inbound_order/get_batch", new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<List<PutawayResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_receipt_batch">获取收货批次</a>
     *
     * @param receivingCode 入库单号
     */
    public ReceiptBatchResponse getReceiptBatch(String receivingCode) {
        return postGoodCang("/inbound_order/get_receipt_batch", new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ReceiptBatchResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/cars_model">获取车型</a>
     */
    public ResponseAsk<List<CarModel>> carsModel() {
        return postGoodCang("/inbound_order/cars_model", null, new ParameterizedTypeReference<ResponseAsk<List<CarModel>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/upload_clearance_document">上传清关文件</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> uploadClearanceDocument(UploadClearanceDocumentPayload payload) {
        return postGoodCang("/inbound_order/upload_clearance_document", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_clearance_document">上传清关文件</a>
     *
     * @param receivingList 入库单号列表
     */
    public ResponseAsk<List<DocumentFileResponse>> getClearanceDocument(List<String> receivingList) {
        return postGoodCang("/inbound_order/get_clearance_document", new ReceivingListPayload(receivingList), new ParameterizedTypeReference<ResponseAsk<List<DocumentFileResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/upload_customs_docs">上传报关资料</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<DocumentFileResponse>> uploadCustomsDocs(UploadCustomsDocsPayload payload) {
        return postGoodCang("/inbound_order/upload_customs_docs", payload, new ParameterizedTypeReference<ResponseAsk<List<DocumentFileResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/create_order">新建出库单</a>
     *
     * @param payload 请求参数
     */
    public OrderCodeResponse createOrder(CreateOrderPayload payload) {
        return postGoodCang("/order/create_order", payload, new ParameterizedTypeReference<OrderCodeResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/create_order">修改出库单</a>
     *
     * @param payload 请求参数
     */
    public OrderCodeResponse modifyOrder(ModifyOrderPayload payload) {
        return postGoodCang("/order/modify_order", payload, new ParameterizedTypeReference<OrderCodeResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_by_code">根据订单号获取单票订单信息</a>
     *
     * @param orderCode 订单号
     */
    public ResponseAsk<Order> getOrderByCode(String orderCode) {
        return postGoodCang("/order/get_order_by_code", new OrderCodePayload(orderCode), new ParameterizedTypeReference<ResponseAsk<Order>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_by_ref_code">根据参考号获取单票订单信息</a>
     *
     * @param referenceNo 参考号
     */
    public ResponseAsk<Order> getOrderByRefCode(String referenceNo) {
        return postGoodCang("/order/get_order_by_ref_code", new ReferenceNoPayload(referenceNo), new ParameterizedTypeReference<ResponseAsk<Order>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_list">获取订单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<Order>> getOrderList(OrderListPayload payload) {
        return postGoodCang("/order/get_order_list", payload, new ParameterizedTypeReference<ResponsePage<List<Order>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_draft_order_list">获取草稿和暂存订单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<Order>> getDraftOrderList(DraftOrderListPayload payload) {
        return postGoodCang("/order/get_draft_order_list", payload, new ParameterizedTypeReference<ResponsePage<List<Order>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/cancel_order">取消订单</a>
     *
     * @param payload 请求参数
     */
    public CancelOrderResponse cancelOrder(CancelOrderPayload payload) {
        return postGoodCang("/order/cancel_order", payload, new ParameterizedTypeReference<CancelOrderResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/query_tracking_status">轨迹查询</a>
     *
     * @param referenceNo 参考号
     */
    public ResponseAsk<TrackingStatusResponse> queryTrackingStatus(String referenceNo) {
        return postGoodCang("/order/query_tracking_status", new ReferenceNoPayload(referenceNo), new ParameterizedTypeReference<ResponseAsk<TrackingStatusResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/batch_query_tracking_status">批量轨迹查询</a>
     *
     * @param codeType  查询参数类型 order_code 订单号(默认) reference_no 订单参考号 tracking_number 跟踪号
     * @param valueList 包含订单号的字符串列表
     */
    public ResponseAsk<TrackingStatusResponse> batchQueryTrackingStatus(String codeType, List<String> valueList) {
        return postGoodCang("/order/batch_query_tracking_status", new QueryTrackingStatusPayload(codeType, valueList), new ParameterizedTypeReference<ResponseAsk<TrackingStatusResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/modify_ex_fulfilment">异常订单修改物流</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> modifyExFulfilment(ModifyExFulfilmentPayload payload) {
        return postGoodCang("/order/modify_ex_fulfilment", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/upload_order_label">上传面单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<OrderCodePayload> uploadOrderLabel(UploadOrderLabelPayload payload) {
        return postGoodCang("/order/upload_order_label", payload, new ParameterizedTypeReference<ResponseAsk<OrderCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/create">创建退货单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReturnOrderResponse> returnOrderCreate(ReturnOrderCreatePayload payload) {
        return postGoodCang("/return_order/create", payload, new ParameterizedTypeReference<ResponseAsk<ReturnOrderResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/create">修改退货单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReturnOrderResponse> returnOrderUpdate(ReturnOrderUpdatePayload payload) {
        return postGoodCang("/return_order/update", payload, new ParameterizedTypeReference<ResponseAsk<ReturnOrderResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/discard">废弃退货单</a>
     *
     * @param roCode  退件单号
     * @param newDesc 退件原因
     */
    public ResponseAsk<Void> returnOrderDiscard(String roCode, String newDesc) {
        return postGoodCang("/return_order/discard", new ReturnOrderDiscardPayload(roCode, newDesc), new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/search">退货单查询</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<ReturnOrder>> returnOrderSearch(ReturnOrderSearchPayload payload) {
        return postGoodCang("/return_order/search", payload, new ParameterizedTypeReference<ResponseAsk<List<ReturnOrder>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/list">退货单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<ReturnOrder>> returnOrderList(ReturnOrderListPayload payload) {
        return postGoodCang("/return_order/list", payload, new ParameterizedTypeReference<ResponsePage<List<ReturnOrder>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/label">售后退件标签</a>
     *
     * @param asroCode 退件号
     */
    public ResponseAsk<ReturnOrderLabelResponse> returnOrderLabel(String asroCode) {
        return postGoodCang("/return_order/label", new AsroCodePayload(asroCode), new ParameterizedTypeReference<ResponseAsk<ReturnOrderLabelResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/unauthorized_list">获取待确认退货列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<UnauthorizedListResponse> unauthorizedList(UnauthorizedListPayload payload) {
        return postGoodCang("/return_order/unauthorized_list", payload, new ParameterizedTypeReference<ResponseAsk<UnauthorizedListResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/unauthorized_confirm">处理待确认退货</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> unauthorizedConfirm(UnauthorizedConfirmPayload payload) {
        return postGoodCang("/return_order/unauthorized_confirm", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/claim_order_save">退货认领</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<AsroCodePayload> claimOrderSave(ClaimOrderSavePayload payload) {
        return postGoodCang("/return_order/claim_order_save", payload, new ParameterizedTypeReference<ResponseAsk<AsroCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/claim_order_list">退货认领列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<ClaimOrder>> claimOrderList(ClaimOrderListPayload payload) {
        return postGoodCang("/return_order/claim_order_list", payload, new ParameterizedTypeReference<ResponsePage<List<ClaimOrder>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/claim_order_details">退货认领详情</a>
     *
     * @param claimCode 认领单号
     */
    public ResponseAsk<ClaimOrderDetail> claimOrderDetail(String claimCode) {
        return postGoodCang("/return_order/claim_order_details", new ClaimCodePayload(claimCode), new ParameterizedTypeReference<ResponseAsk<ClaimOrderDetail>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/message">客服留言</a>
     *
     * @param returnOrderCodes 退件订单号
     * @param message          留言说明
     */
    public ResponseAsk<ResultPayload> returnOrderMessage(List<String> returnOrderCodes, String message) {
        return postGoodCang("/return_order/message", new ReturnOrderMessagePayload(returnOrderCodes, message), new ParameterizedTypeReference<ResponseAsk<ResultPayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/return_order/get_service_config">获取退货配置</a>
     */
    public ResponseAsk<List<ServiceConfig>> getServiceConfig() {
        return postGoodCang("/return_order/get_service_config", null, new ParameterizedTypeReference<ResponseAsk<List<ServiceConfig>>>() {
        });
    }
}
