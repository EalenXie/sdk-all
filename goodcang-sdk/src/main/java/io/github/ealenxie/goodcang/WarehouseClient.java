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
    private final String appKey;
    private final String appToken;

    public WarehouseClient(String appKey, String appToken) {
        this(new RestTemplate(), appKey, appToken);
    }

    public WarehouseClient(RestOperations restOperations, String appKey, String appToken) {
        super(restOperations);
        this.appKey = appKey;
        this.appToken = appToken;
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_vat_list">进出口商列表</a>
     */
    public ResponseAsk<List<Vat>> getInboundOrderVatList(PagePayload payload) {
        return postGoodCang("/inbound_order/get_vat_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<Vat>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_smcode_twc_to_warehouse">获取物流产品与目的仓中转仓</a>
     */
    public ResponseAsk<SmCodeTwcToWarehouseResponse> getSmCodeTwcToWarehouse() {
        return postGoodCang("/inbound_order/get_smcode_twc_to_warehouse", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<SmCodeTwcToWarehouseResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/create_grn">创建入库单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReceivingCodePayload> createGrn(CreateGrnPayload payload) {
        return postGoodCang("/inbound_order/create_grn", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/modify_grn">编辑入库单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ReceivingCodePayload> modifyGrn(ModifyGrnPayload payload) {
        return postGoodCang("/inbound_order/modify_grn", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/del_grn">废弃入库单</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<ReceivingCodePayload> delGrn(String receivingCode) {
        return postGoodCang("/inbound_order/del_grn", appKey, appToken, new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<ReceivingCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_grn_list">获取入库单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<GrnInfo>> getGrnList(GrnListPayload payload) {
        return postGoodCang("/inbound_order/get_grn_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponsePage<List<GrnInfo>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_grn_detail">获取入库单明细</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<GrnDetail> getGrnDetail(String receivingCode) {
        return postGoodCang("/inbound_order/get_grn_detail", appKey, appToken, new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<GrnDetail>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/del_asn_box">删除入库单箱唛</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<String>> delAsnBox(DelAsnBoxPayload payload) {
        return postGoodCang("/inbound_order/del_asn_box", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<String>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/print_gc_receiving_box">打印箱唛</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ImageResponse> printGcReceivingBox(PrintGcReceivingBoxPayload payload) {
        return postGoodCang("/inbound_order/print_gc_receiving_box", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<ImageResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_batch">获取上架批次</a>
     *
     * @param receivingCode 入库单号
     */
    public ResponseAsk<List<PutawayResponse>> getBatch(String receivingCode) {
        return postGoodCang("/inbound_order/get_batch", appKey, appToken, new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ResponseAsk<List<PutawayResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_receipt_batch">获取收货批次</a>
     *
     * @param receivingCode 入库单号
     */
    public ReceiptBatchResponse getReceiptBatch(String receivingCode) {
        return postGoodCang("/inbound_order/get_receipt_batch", appKey, appToken, new ReceivingCodePayload(receivingCode), new ParameterizedTypeReference<ReceiptBatchResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/cars_model">获取车型</a>
     */
    public ResponseAsk<List<CarModel>> carsModel() {
        return postGoodCang("/inbound_order/cars_model", appKey, appToken, null, new ParameterizedTypeReference<ResponseAsk<List<CarModel>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/upload_clearance_document">上传清关文件</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> uploadClearanceDocument(UploadClearanceDocumentPayload payload) {
        return postGoodCang("/inbound_order/upload_clearance_document", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/get_clearance_document">上传清关文件</a>
     *
     * @param receivingList 入库单号列表
     */
    public ResponseAsk<List<DocumentFileResponse>> getClearanceDocument(List<String> receivingList) {
        return postGoodCang("/inbound_order/get_clearance_document", appKey, appToken, new ReceivingListPayload(receivingList), new ParameterizedTypeReference<ResponseAsk<List<DocumentFileResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inbound_order/upload_customs_docs">上传报关资料</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<DocumentFileResponse>> uploadCustomsDocs(UploadCustomsDocsPayload payload) {
        return postGoodCang("/inbound_order/upload_customs_docs", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<List<DocumentFileResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/create_order">新建出库单</a>
     *
     * @param payload 请求参数
     */
    public OrderCodeResponse createOrder(CreateOrderPayload payload) {
        return postGoodCang("/order/create_order", appKey, appToken, payload, new ParameterizedTypeReference<OrderCodeResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/create_order">修改出库单</a>
     *
     * @param payload 请求参数
     */
    public OrderCodeResponse modifyOrder(ModifyOrderPayload payload) {
        return postGoodCang("/order/modify_order", appKey, appToken, payload, new ParameterizedTypeReference<OrderCodeResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_by_code">根据订单号获取单票订单信息</a>
     *
     * @param orderCode 订单号
     */
    public ResponseAsk<Order> getOrderByCode(String orderCode) {
        return postGoodCang("/order/get_order_by_code", appKey, appToken, new OrderCodePayload(orderCode), new ParameterizedTypeReference<ResponseAsk<Order>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_by_ref_code">根据参考号获取单票订单信息</a>
     *
     * @param referenceNo 参考号
     */
    public ResponseAsk<Order> getOrderByRefCode(String referenceNo) {
        return postGoodCang("/order/get_order_by_ref_code", appKey, appToken, new ReferenceNoPayload(referenceNo), new ParameterizedTypeReference<ResponseAsk<Order>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_order_list">获取订单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<Order>> getOrderList(OrderListPayload payload) {
        return postGoodCang("/order/get_order_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponsePage<List<Order>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/get_draft_order_list">获取草稿和暂存订单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<Order>> getDraftOrderList(DraftOrderListPayload payload) {
        return postGoodCang("/order/get_draft_order_list", appKey, appToken, payload, new ParameterizedTypeReference<ResponsePage<List<Order>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/cancel_order">取消订单</a>
     *
     * @param payload 请求参数
     */
    public CancelOrderResponse cancelOrder(CancelOrderPayload payload) {
        return postGoodCang("/order/cancel_order", appKey, appToken, payload, new ParameterizedTypeReference<CancelOrderResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/query_tracking_status">轨迹查询</a>
     *
     * @param referenceNo 参考号
     */
    public ResponseAsk<TrackingStatusResponse> queryTrackingStatus(String referenceNo) {
        return postGoodCang("/order/query_tracking_status", appKey, appToken, new ReferenceNoPayload(referenceNo), new ParameterizedTypeReference<ResponseAsk<TrackingStatusResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/batch_query_tracking_status">批量轨迹查询</a>
     *
     * @param codeType  查询参数类型 order_code 订单号(默认) reference_no 订单参考号 tracking_number 跟踪号
     * @param valueList 包含订单号的字符串列表
     */
    public ResponseAsk<TrackingStatusResponse> batchQueryTrackingStatus(String codeType, List<String> valueList) {
        return postGoodCang("/order/batch_query_tracking_status", appKey, appToken, new QueryTrackingStatusPayload(codeType, valueList), new ParameterizedTypeReference<ResponseAsk<TrackingStatusResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/modify_ex_fulfilment">异常订单修改物流</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> modifyExFulfilment(ModifyExFulfilmentPayload payload) {
        return postGoodCang("/order/modify_ex_fulfilment", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/order/upload_order_label">上传面单</a>
     */
    public ResponseAsk<OrderCodePayload> uploadOrderLabel(UploadOrderLabelPayload payload) {
        return postGoodCang("/order/upload_order_label", appKey, appToken, payload, new ParameterizedTypeReference<ResponseAsk<OrderCodePayload>>() {
        });
    }

}
