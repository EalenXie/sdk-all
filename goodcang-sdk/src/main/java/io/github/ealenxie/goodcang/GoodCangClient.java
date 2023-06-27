package io.github.ealenxie.goodcang;

import io.github.ealenxie.goodcang.assistant.*;
import io.github.ealenxie.goodcang.base.*;
import io.github.ealenxie.goodcang.finance.*;
import io.github.ealenxie.goodcang.product.*;
import io.github.ealenxie.goodcang.warehouse.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 17:38
 */
public class GoodCangClient {
    protected static final String HOST = "https://oms.goodcang.net/public_open";
    protected static final String TEST_HOST = "https://uat-oms.eminxing.com/public_open";
    private final String appKey;
    private final String appToken;
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

    public GoodCangClient(String appKey, String appToken) {
        this(appKey, appToken, new RestTemplate());
    }

    public GoodCangClient(String appKey, String appToken, RestOperations restOperations) {
        this.appKey = appKey;
        this.appToken = appToken;
        this.restOperations = restOperations;
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_country">获取国家/地区列表</a>
     */
    public ResponseAsk<List<Country>> getCountry() {
        return postGoodCang("/base_data/get_country", null, new ParameterizedTypeReference<ResponseAsk<List<Country>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_warehouse">获取仓库信息</a>
     */
    public ResponseAsk<List<Warehouse>> getWarehouse() {
        return postGoodCang("/base_data/get_warehouse", null, new ParameterizedTypeReference<ResponseAsk<List<Warehouse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_shipping_method">获取物流产品</a>
     *
     * @param warehouseCode 尾程仓库代码
     */
    public ResponseAsk<List<ShippingMethod>> getShippingMethod(String warehouseCode) {
        return postGoodCang("/base_data/get_shipping_method", new WarehouseCodePayload(warehouseCode), new ParameterizedTypeReference<ResponseAsk<List<ShippingMethod>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/get_account_list">获取公司账户</a>
     */
    public ResponseAsk<AccountListResponse> getAccountList() {
        return postGoodCang("/base_data/get_account_list", null, new ParameterizedTypeReference<ResponseAsk<AccountListResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/cost_type_list">获取费用类型</a>
     *
     * @param signBusinessType 费用业务类型
     */
    public ResponseAsk<List<CostType>> costTypeList(Integer signBusinessType) {
        return postGoodCang("/base_data/cost_type_list", new SignBusinessTypePayload(signBusinessType), new ParameterizedTypeReference<ResponseAsk<List<CostType>>>() {
        });
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/fuel_rate_list">获取燃油费率</a>
     *
     * @param payload 费用业务类型
     */
    public ResponseAsk<ListTotalPayload<FuelRate>> fuelRateList(FuelRatePayload payload) {
        return postGoodCang("/base_data/fuel_rate_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<FuelRate>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/fuel_rate_list">获取异步任务结果列表</a>
     *
     * @param requestIdList 请求id数组
     */
    public ResponseAsk<List<TaskStatus>> taskStatusList(List<String> requestIdList) {
        return postGoodCang("/base_data/task_status_list", new TaskStatusListPayload(requestIdList), new ParameterizedTypeReference<ResponseAsk<List<TaskStatus>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/sys_base_info">获取业务基础数据信息</a>
     */
    public ResponseAsk<BaseInfoResponse> sysBaseInfo() {
        return postGoodCang("/base_data/sys_base_info", null, new ParameterizedTypeReference<ResponseAsk<BaseInfoResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/base_data/upload_attachment">上传附件</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<AttachmentResponse> uploadAttachment(UploadAttachmentPayload payload) {
        return postGoodCang("/base_data/upload_attachment", payload, new ParameterizedTypeReference<ResponseAsk<AttachmentResponse>>() {
        });
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/get_calculate_delivery_fee">运费试算</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<CalculateDeliveryFee>> getCalculateDeliveryFee(CalculateDeliveryFeePayload payload) {
        return postGoodCang("/inventory/get_calculate_delivery_fee", payload, new ParameterizedTypeReference<ResponseAsk<List<CalculateDeliveryFee>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/address/verify_address_info">地址校验</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<VerifyAddressInfoResponse> verifyAddressInfo(VerifyAddressInfoPayload payload) {
        return postGoodCang("/address/verify_address_info", payload, new ParameterizedTypeReference<ResponseAsk<VerifyAddressInfoResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_category">获取商品品类</a>
     */
    public ResponseAsk<List<Category>> getCategory() {
        return postGoodCang("/product/get_category", null, new ParameterizedTypeReference<ResponseAsk<List<Category>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_declare_commodity_name_list">获取建议中文申报品名</a>
     */
    public ResponseAsk<DeclareListResponse> getDeclareCommodityNameList() {
        return postGoodCang("/product/get_declare_commodity_name_list", null, new ParameterizedTypeReference<ResponseAsk<DeclareListResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_declare_commodity_name_list">获取建议材质</a>
     */
    public ResponseAsk<MaterialListResponse> getMaterialList() {
        return postGoodCang("/product/get_material_list", null, new ParameterizedTypeReference<ResponseAsk<MaterialListResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/add_product">新建商品</a>
     *
     * @param payload 请求参数
     */
    public ProductResponse addProduct(AddProductPayload payload) {
        return postGoodCang("/product/add_product", payload, new ParameterizedTypeReference<ProductResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/edit_product">修改商品</a>
     *
     * @param payload 请求参数
     */
    public ProductResponse editProduct(EditProductPayload payload) {
        return postGoodCang("/product/edit_product", payload, new ParameterizedTypeReference<ProductResponse>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/get_product_sku_list">获取商品列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<ProductSkuResponse>> getProductSkuList(ProductSkuListPayload payload) {
        return postGoodCang("/product/get_product_sku_list", payload, new ParameterizedTypeReference<ResponsePage<List<ProductSkuResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/print_sku">获取SKU标签文件</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<PrintSkuResponse> printSku(PrintSkuPayload payload) {
        return postGoodCang("/product/print_sku", payload, new ParameterizedTypeReference<ResponseAsk<PrintSkuResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/add_import_country">新增商品进口国数据</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> addImportCountry(AddImportCountryPayload payload) {
        return postGoodCang("/product/add_import_country", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/update_customs_clearance">更新商品清关信息</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> updateCustomsClearance(UpdateCustomsClearancePayload payload) {
        return postGoodCang("/product/update_customs_clearance", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/modify_product_status">修改商品状态</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> modifyProductStatus(ModifyProductStatusPayload payload) {
        return postGoodCang("/product/modify_product_status", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/product_freeze_list">获取冻结商品列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<ProductFreeze>> productFreezeList(ProductFreezeListPayload payload) {
        return postGoodCang("/product/product_freeze_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<ProductFreeze>>>() {
        });
    }


    /**
     * <a href="https://open.goodcang.com/docs_api/product/product_freeze_detail">获取冻结商品详情</a>
     *
     * @param id 冻结Id
     */
    public ResponseAsk<ProductFreezeDetail> productFreezeDetail(String id) {
        return postGoodCang("/product/product_freeze_detail", new IdPayload(id), new ParameterizedTypeReference<ResponseAsk<ProductFreezeDetail>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/create_serial_number">新增序列号</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<SnResponse>> createSerialNumber(SnListPayload payload) {
        return postGoodCang("/product/create_serial_number", payload, new ParameterizedTypeReference<ResponseAsk<List<SnResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/discard_serial_number">废弃序列号</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<List<SnResponse>> discardSerialNumber(SnListPayload payload) {
        return postGoodCang("/product/discard_serial_number", payload, new ParameterizedTypeReference<ResponseAsk<List<SnResponse>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/product/serial_number_list">获取序列号列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<SerialNumberResponse>> serialNumberList(SerialNumberListPayload payload) {
        return postGoodCang("/product/serial_number_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<SerialNumberResponse>>>() {
        });
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
    public ResponseAsk<ListTotalPayload<ReturnOrderUnauthorized>> unauthorizedList(UnauthorizedListPayload payload) {
        return postGoodCang("/return_order/unauthorized_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<ReturnOrderUnauthorized>>>() {
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

    /**
     * <a href="https://open.goodcang.com/docs_api/plan_order/create">新建计划单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<PlanOrderCodePayload> planOrderCreate(PlanOrderCreatePayload payload) {
        return postGoodCang("/plan_order/create", payload, new ParameterizedTypeReference<ResponseAsk<PlanOrderCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/plan_order/list">计划单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<PlanOrder>> planOrderList(PlanOrderListPayload payload) {
        return postGoodCang("/plan_order/list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<PlanOrder>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/plan_order/cancel">取消计划单</a>
     *
     * @param planOrderCode 计划单号
     * @param reason        取消原因
     */
    public ResponseAsk<Void> planOrderCancel(String planOrderCode, String reason) {
        return postGoodCang("/plan_order/cancel", new PlanOrderCancelPayload(planOrderCode, reason), new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/plan_order/box_list">装箱列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<Box>> planOrderBoxList(PlanOrderBoxListPayload payload) {
        return postGoodCang("/plan_order/box_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<Box>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/get_product_inventory">获取库存</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<ProductInventory>> getProductInventory(GetProductInventoryPayload payload) {
        return postGoodCang("/inventory/get_product_inventory", payload, new ParameterizedTypeReference<ResponsePage<List<ProductInventory>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/get_inventory_log">获取库存动态列表</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<InventoryLog>> getInventoryLog(GetInventoryLogPayload payload) {
        return postGoodCang("/inventory/get_inventory_log", payload, new ParameterizedTypeReference<ResponsePage<List<InventoryLog>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/inventory_age_list">获取库龄列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<InventoryAge>> inventoryAgeList(InventoryAgeListPayload payload) {
        return postGoodCang("/inventory/inventory_age_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<InventoryAge>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/inventory/set_inventory_warning">设置库龄预警</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> setInventoryWarning(ListPayload<SetInventory> payload) {
        return postGoodCang("/inventory/set_inventory_warning", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/assistant/logistic_ticket_list">获取查件列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<LogisticTicket>> logisticTicketList(LogisticTicketListPayload payload) {
        return postGoodCang("/assistant/logistic_ticket_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<LogisticTicket>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/assistant/logistic_ticket_type_list">获取查件单类型列表</a>
     *
     * @param smCode 请求参数
     */
    public ResponseAsk<List<LogisticTicketType>> logisticTicketTypeList(String smCode) {
        return postGoodCang("/assistant/logistic_ticket_type_list", new SmCodePayload(smCode), new ParameterizedTypeReference<ResponseAsk<List<LogisticTicketType>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/assistant/logistic_ticket_list">新增查件单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<IoCodePayload> createLogisticTicket(CreateLogisticTicketPayload payload) {
        return postGoodCang("/assistant/create_logistic_ticket", payload, new ParameterizedTypeReference<ResponseAsk<IoCodePayload>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/assistant/modify_logistic_ticket">新增查件单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> modifyLogisticTicket(ModifyLogisticTicketPayload payload) {
        return postGoodCang("/assistant/modify_logistic_ticket", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/assistant/logistic_ticket_detail">获取查件单详情</a>
     *
     * @param ioCode 查件单号
     */
    public ResponseAsk<LogisticTicketDetail> logisticTicketDetail(String ioCode) {
        return postGoodCang("/assistant/logistic_ticket_detail", new IoCodePayload(ioCode), new ParameterizedTypeReference<ResponseAsk<LogisticTicketDetail>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/assistant/modify_logistic_ticket_status">查件单状态变更</a>
     *
     * @param ioCodeList 查件单号列表
     * @param status     修改的状态
     */
    public ResponseAsk<Void> modifyLogisticTicketStatus(List<String> ioCodeList, Integer status) {
        return postGoodCang("/assistant/modify_logistic_ticket_status", new ModifyLogisticTicketStatusPayload(ioCodeList, status), new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/assistant/recheck_logistic_ticket">复查查件单</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<Void> recheckLogisticTicket(RecheckLogisticTicketPayload payload) {
        return postGoodCang("/assistant/recheck_logistic_ticket", payload, new ParameterizedTypeReference<ResponseAsk<Void>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/get_wh_inventory_storage">获取仓租信息</a>
     *
     * @param payload 请求参数
     */
    public ResponsePage<List<WhInventoryStorage>> getWhInventoryStorage(GetWhInventoryStoragePayload payload) {
        return postGoodCang("/finance/get_wh_inventory_storage", payload, new ParameterizedTypeReference<ResponsePage<List<WhInventoryStorage>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/currency_rate_list">获取货币列表</a>
     */
    public ResponseAsk<List<Currency>> currencyRateList() {
        return postGoodCang("/finance/currency_rate_list", null, new ParameterizedTypeReference<ResponseAsk<List<Currency>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/my_bank_list">获取银行列表</a>
     */
    public ResponseAsk<List<MyBank>> myBankList() {
        return postGoodCang("/finance/my_bank_list", null, new ParameterizedTypeReference<ResponseAsk<List<MyBank>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/get_wh_inventory_storage_detail">获取仓租明细</a>
     *
     * @param wisCode 仓租单号
     */
    public ResponsePage<List<WhInventoryStorageDetail>> getWhInventoryStorageDetail(String wisCode) {
        return postGoodCang("/finance/get_wh_inventory_storage_detail", new WisCodePayload(wisCode), new ParameterizedTypeReference<ResponsePage<List<WhInventoryStorageDetail>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/cost_flow_list">获取费用流水</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<CostFlowResponse> costFlowList(CostFlowListPayload payload) {
        return postGoodCang("/finance/cost_flow_list", payload, new ParameterizedTypeReference<ResponseAsk<CostFlowResponse>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/top_up_record">获取充值明细</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<TopUpRecord>> topUpRecord(TopUpRecordPayload payload) {
        return postGoodCang("/finance/top_up_record", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<TopUpRecord>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/billing_list">获取账单列表</a>
     *
     * @param payload 请求参数
     */
    public ResponseAsk<ListTotalPayload<Billing>> billingList(BillingListPayload payload) {
        return postGoodCang("/finance/billing_list", payload, new ParameterizedTypeReference<ResponseAsk<ListTotalPayload<Billing>>>() {
        });
    }

    /**
     * <a href="https://open.goodcang.com/docs_api/finance/billing_export">下载账单文件</a>
     *
     * @param billNumberList 账单号列表
     */
    public ResponseAsk<String> billingExport(List<String> billNumberList) {
        return postGoodCang("/finance/billing_export", new BillingExportPayload(billNumberList), new ParameterizedTypeReference<ResponseAsk<String>>() {
        });
    }

    /**
     * post调用goodcang接口
     *
     * @param urlNotPrefix               无环境前缀的url路径
     * @param payload                    请求参数
     * @param parameterizedTypeReference 参数返回类型
     */
    @SuppressWarnings("all")
    private <T> T postGoodCang(String urlNotPrefix, @Nullable Object payload, ParameterizedTypeReference<T> parameterizedTypeReference) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", isSandBox() ? TEST_HOST : HOST, urlNotPrefix));
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.add("app-key", appKey);
        headers.add("app-token", appToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(payload, headers), parameterizedTypeReference).getBody();
    }
}
