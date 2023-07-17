package io.github.ealenxie.winit;

import io.github.ealenxie.winit.oswh.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * Created by EalenXie on 2023/1/20 12:18
 * <a href="https://developer.winit.com.cn/document/detail/id/99.html">海外仓服务API</a>
 */
public class OswhClient extends WinitClient {

    public OswhClient(WinitConfig winitConfig) {
        super(winitConfig);
    }

    public OswhClient(WinitConfig winitConfig, RestOperations restOperations) {
        super(winitConfig, restOperations);
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/15.html">注册/编辑商品</a>
     */
    public WinitResponse<List<RegisterProduct>> registerProduct(ProductsPayload payload) {
        return postWinit("registerProduct", payload, new ParameterizedTypeReference<WinitResponse<List<RegisterProduct>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/17.html">查询商品信息</a>
     */
    public WinitResponse<PageTotalListResponse<CommodityInfo>> getCommodityInfo(QueryCommodityInfo payload) {
        return postWinit("winit.mms.item.list", payload, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<CommodityInfo>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/226.html">查询商品审核状态</a>
     */
    public WinitResponse<PageTotalListResponse<ProductAuditStatus>> getProductAuditStatus(ProductQueryParams payload) {
        return postWinit("mms.itemmttask.queryItemMtEntitys", payload, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<ProductAuditStatus>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/135.html">打印商品条码标签-返回带有单品信息</a>
     */
    public WinitResponse<String> printProductLabelControlItemInfo(PrintProductLabelPayload payload) {
        return postWinit("winit.singleitem.label.print.v2", payload, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/19.html">打印商品条码标签</a>
     */
    public WinitResponse<String> printProductLabel(PrintProductLabelPayload payload) {
        return postWinit("winit.singleitem.label.print", payload, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/241.html">查询商品的单品条码及其状态</a>
     */
    public WinitResponse<PageTotalListResponse<LabelInfo>> getProductLabelInfo(ProductLabelQueryParams queryParams) {
        return postWinit("winit.singleitem.label.print", queryParams, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<LabelInfo>>>() {
        });
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/44.html">查询总库存</a>
     *
     * @param payload 请求入参
     */
    public WinitResponse<WarehouseStorageResp> queryWarehouseStorage(QueryWarehouseStorage payload) {
        return postWinit("queryWarehouseStorage", payload, new ParameterizedTypeReference<WinitResponse<WarehouseStorageResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/58.html">查询总库存（含DOI）</a>
     */
    public WinitResponse<ProductInventoryResp> queryProductInventoryList4Page(QueryProductInventory payload) {
        return postWinit("queryProductInventoryList4Page", payload, new ParameterizedTypeReference<WinitResponse<ProductInventoryResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/297.html">查询分类库存</a>
     */
    public WinitResponse<PageTotalListResponse<WinItInventoryType>> queryWinItInventoryType(QueryWinItInventoryType payload) {
        return postWinit("winit.inventory.type.pageInv", payload, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<WinItInventoryType>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/254.html">库存流水查询</a>
     */
    public WinitResponse<PageTotalListResponse<InventoryStatement>> queryInventoryStatement(QueryInventoryStatement payload) {
        return postWinit("winit.inventory.pageInvInouts", payload, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<InventoryStatement>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/231.html">查询仓租单明细</a>
     */
    public WinitResponse<PageTotalListResponse<WareHouseReceiptDetails>> queryWarehouseReceiptDetails(QueryWarehouseReceiptDetails payload) {
        return postWinit("winit.ims.queryWarehouseReceiptDetails", payload, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<WareHouseReceiptDetails>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/308.html">创建库存调整单</a>
     */
    public WinitResponse<OrderNoPayload> createInventoryAdjustment(InventoryAdjustmentPayload payload) {
        return postWinit("wh.inventoryAdjustment.createOrder", payload, new ParameterizedTypeReference<WinitResponse<OrderNoPayload>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/141.html">创建入库单</a>
     */
    public WinitResponse<OrderNoPayload> createOrder(InboundOrderPayload payload) {
        return postWinit("winit.wh.inbound.order.create", payload, new ParameterizedTypeReference<WinitResponse<OrderNoPayload>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/31.html">打印包裹标签</a>
     */
    public WinitResponse<LabelPayload> printPackageLabel(PrintPackageLabelPayload payload) {
        return postWinit("winit.wh.inbound.printPackageLabel", payload, new ParameterizedTypeReference<WinitResponse<LabelPayload>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/36.html">预估入库费用</a>
     */
    public WinitResponse<EstimateOrderFeeResponse> estimateOrderFee(OrderNoPayload payload) {
        return postWinit("winit.wh.inbound.estimateOrderFee", payload, new ParameterizedTypeReference<WinitResponse<EstimateOrderFeeResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/38.html">查询入库单列表</a>
     */
    public WinitResponse<InboundOrderResponse> getInBoundOrders(InboundOrderQueryParams queryParams) {
        return postWinit("winit.wh.inbound.getOrderList", queryParams, new ParameterizedTypeReference<WinitResponse<InboundOrderResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/39.html">查询入库单详情</a>
     */
    public WinitResponse<OrderResponse> getOrderDetail(OrderDetailQueryParams payload) {
        return postWinit("winit.wh.inbound.getOrderDetail", payload, new ParameterizedTypeReference<WinitResponse<OrderResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/94.html">查询入库轨迹</a>
     */
    public WinitResponse<OrderTrackResponse> getOrderTracking(OrderNoPayload payload) {
        return postWinit("wh.tracking.queryOrderTracking", payload, new ParameterizedTypeReference<WinitResponse<OrderTrackResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/138.html">查询入库单费用</a>
     */
    public WinitResponse<PageCurrentTotalListResponse<FeeData>> getInboundOrderFee(OrderFeeQueryParams queryParams) {
        return postWinit("sms.incomeSettlement.pageInboundLine", queryParams, new ParameterizedTypeReference<WinitResponse<PageCurrentTotalListResponse<FeeData>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/306.html">新增子包裹条码</a>
     */
    public WinitResponse<SubPackageResponse> generateSubPackageBarcode(SubPackagePayload payload) {
        return postWinit("csi.seller.generateSubPackageBarcode", payload, new ParameterizedTypeReference<WinitResponse<SubPackageResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/304.html">自验货数据导入</a>
     */
    public WinitResponse<Object> importPacking(ImportPackPayload payload) {
        return postWinit("winit.wh.inbound.selfinspection.importpackinglist", payload, new ParameterizedTypeReference<WinitResponse<Object>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/305.html">自验货确认完成</a>
     */
    public WinitResponse<Object> importPackingConfirm(ConfirmPayload payload) {
        return postWinit("winit.wh.inbound.selfinspection.confirm", payload, new ParameterizedTypeReference<WinitResponse<Object>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/301.html">直发入库-上传快递单号</a>
     */
    public WinitResponse<Void> uploadExpressNo(UploadExpressPayload payload) {
        return postWinit("wh.inboundOrder.uploadExpressNo", payload, new ParameterizedTypeReference<WinitResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/300.html">直发入库-确认发货</a>
     */
    public WinitResponse<OrderResponse> confirmShipment(ConfirmShipmentPayload payload) {
        return postWinit("winit.wh.inbound.shipment.confirm", payload, new ParameterizedTypeReference<WinitResponse<OrderResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/285.html">作废入库单</a>
     */
    public WinitResponse<Void> cancelOrder(CancelOrderPayload payload) {
        return postWinit("winit.wh.inbound.voidOrder", payload, new ParameterizedTypeReference<WinitResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/28.html">查询头程服务</a>
     */
    public WinitResponse<List<WinitProducts>> getWinItProducts(QueryWinItProducts payload) {
        return postWinit("winit.wh.pms.getWinitProducts", payload, new ParameterizedTypeReference<WinitResponse<List<WinitProducts>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/29.html">查询验货/目的仓</a>
     */
    public WinitResponse<WarehouseResponse> getWarehouse(WarehouseQueryParams queryParams) {
        return postWinit("winit.pms.getWarehouseList", queryParams, new ParameterizedTypeReference<WinitResponse<WarehouseResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/30.html">查询入库可选商品</a>
     */
    public WinitResponse<List<AvailableResponse>> getAvailableMerchandise(AvailableMerchandisePayload payload) {
        return postWinit("winit.wh.mms.getAvailableMerchandise", payload, new ParameterizedTypeReference<WinitResponse<List<AvailableResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/140.html">查询出口报关-EOR类型</a>
     */
    public WinitResponse<List<CodeName>> queryEorList() {
        return postWinit("winit.ups.eorType.queryEorList", null, new ParameterizedTypeReference<WinitResponse<List<CodeName>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/139.html">查询进口报关-IOR规则</a>
     */
    public WinitResponse<List<DeclarationRule>> declarationRuleList(DeclarationRuleListData data) {
        return postWinit("winit.ups.importDeclarationRule.queryList", data, new ParameterizedTypeReference<WinitResponse<List<DeclarationRule>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/35.html">查询提货地址</a>
     */
    public WinitResponse<PickupAddressList> getPickupAddress(PageParams pageParams) {
        return postWinit("winit.ums.getPickupAddress", new PageParamsData(pageParams), new ParameterizedTypeReference<WinitResponse<PickupAddressList>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/34.html">查询发货供应商</a>
     */
    public WinitResponse<Carriers> getCarriers(String shipperType) {
        return postWinit("winit.ups.carrier.getCarriers", new ShipperTypeData(shipperType), new ParameterizedTypeReference<WinitResponse<Carriers>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/33.html">查询进/出口供应商</a>
     */
    public WinitResponse<List<VendorInfo>> getVendorInfo(VendorInfoGetData data) {
        return postWinit("winit.ums.getVendorInfo", data, new ParameterizedTypeReference<WinitResponse<List<VendorInfo>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/32.html">查询物流计划</a>
     */
    public WinitResponse<PlanListResponse> getLogisticsPlan(LogisticsPlanGetData data) {
        return postWinit("winit.tms.getLogisticsPlan", data, new ParameterizedTypeReference<WinitResponse<PlanListResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/247.html">创建出库单-新</a>
     */
    public WinitResponse<CreateOutboundOrderResponse> createSubmittedOrder(CreateSubmittedOrderPayload payload) {
        return postWinit("wh.outbound.createSubmittedOrder", payload, new ParameterizedTypeReference<WinitResponse<CreateOutboundOrderResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/49.html">创建出库单</a>
     */
    public WinitResponse<CreateOutboundOrderResponse> createOutboundOrder(CreateOutboundOrderPayload payload) {
        return postWinit("createOutboundOrder", payload, new ParameterizedTypeReference<WinitResponse<CreateOutboundOrderResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/96.html">预估派送运费-3</a>
     */
    public WinitResponse<CalcDeliveryFeeResponse> calcDeliveryFee(CalcDeliveryFeePayload payload) {
        return postWinit("wh.outbound.calcDeliveryFee", payload, new ParameterizedTypeReference<WinitResponse<CalcDeliveryFeeResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/299.html">出库上传附件</a>
     */
    public WinitResponse<String> uploadLabel(UploadOrderLabelPayload payload) {
        return postWinit("pis.orderLabel.uploadLabel", payload, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/54.html">查询出库单（列表）</a>
     */
    public WinitResponse<OutboundOrderResp<OutboundOrder>> queryOutboundOrderList(QueryOutboundOrderPayload payload) {
        return postWinit("queryOutboundOrderList", payload, new ParameterizedTypeReference<WinitResponse<OutboundOrderResp<OutboundOrder>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/55.html">查询出库单</a>
     */
    public WinitResponse<OutboundOrderResp<OutboundOrderInfoResponse>> queryOutboundOrder(OutboundOrderNumPayload payload) {
        return postWinit("queryOutboundOrder", payload, new ParameterizedTypeReference<WinitResponse<OutboundOrderResp<OutboundOrderInfoResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/145.html">查询派送费用</a>
     */
    public WinitResponse<PageCurrentTotalListResponse<OutboundOrderFee>> queryOutboundOrderFee(QueryOrderFeePayload payload) {
        return postWinit("sms.incomeSettlement.queryOutboundOrderFee", payload, new ParameterizedTypeReference<WinitResponse<PageCurrentTotalListResponse<OutboundOrderFee>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/57.html">查询轨迹（库内）</a>
     */
    public WinitResponse<List<Track>> queryTrack(TrackQueryData payload) {
        return postWinit("queryTrack", payload, new ParameterizedTypeReference<WinitResponse<List<Track>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/56.html">查询轨迹（库内+派送）</a>
     */
    public WinitResponse<List<OrderVerdorTracking>> getOrderVerdorTracking(OrderVerdorTrackingData data) {
        return postWinit("tracking.getOrderVerdorTracking", data, new ParameterizedTypeReference<WinitResponse<List<OrderVerdorTracking>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/276.html">作废出库单</a>
     */
    public WinitResponse<String> cancelOutboundOrder(OutboundOrderNumPayload payload) {
        return postWinit("voidOutboundOrder", payload, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/248.html">批量作废出库单</a>
     */
    public WinitResponse<CancelOutboundOrderResponse> batchCancelOutboundOrder(OrderCancelListData data) {
        return postWinit("wh.outbound.batchVoidOrder", data, new ParameterizedTypeReference<WinitResponse<CancelOutboundOrderResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/45.html">查询派送方式</a>
     */
    public WinitResponse<List<DeliveryWayResponse>> queryDeliveryWay(String warehouseID) {
        return postWinit("queryDeliveryWay", new WarehouseIdData(warehouseID), new ParameterizedTypeReference<WinitResponse<List<DeliveryWayResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/43.html">查询仓库代码</a>
     */
    public WinitResponse<List<WarehousePayload>> queryWarehouse() {
        return postWinit("queryWarehouse", null, new ParameterizedTypeReference<WinitResponse<List<WarehousePayload>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/151.html">创建退货订单</a>
     */
    public WinitResponse<Object> createReturnGoodsOrder(ReturnGoodsOrderCreateData data) {
        return postWinit("rma.returnGoodsOrder.createReturnGoodsOrder", data, new ParameterizedTypeReference<WinitResponse<Object>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/265.html">更新退货单商品信息</a>
     */
    public WinitResponse<MerchandiesInfoResponse> updateMerchandise(MerchandiseUpdateData data) {
        return postWinit("rma.returnGoodsOrder.updateMerchandise", data, new ParameterizedTypeReference<WinitResponse<MerchandiesInfoResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/310.html">查询Returnlabel面单</a>
     */
    public WinitResponse<List<ReturnLabel>> queryReturnLabel(ReturnGoodsOrderNosData data) {
        return postWinit("rma.returnGoodsOrder.queryReturnLabel", data, new ParameterizedTypeReference<WinitResponse<List<ReturnLabel>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/146.html">查询退货订单</a>
     */
    public WinitResponse<PageTotalListResponse<ReturnOrder>> queryReturnOrderList(ReturnOderListQueryData data) {
        return postWinit("rma.returnGoodsOrder.queryReturnOderList", data, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<ReturnOrder>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/152.html">取消退货订单</a>
     */
    public WinitResponse<ReturnOrderVoidResponse> voidReturnOrder(ReturnGoodsOrderNosData data) {
        return postWinit("rma.returnGoodsOrder.voidOrder", data, new ParameterizedTypeReference<WinitResponse<ReturnOrderVoidResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/282.html">查询退货派送方式</a>
     */
    public WinitResponse<ListResponse<PscResponse>> queryPSCList() {
        return postWinit("rma.returnGoodsOrder.queryPSCList", null, new ParameterizedTypeReference<WinitResponse<ListResponse<PscResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/137.html">查询退货商品</a>
     */
    public WinitResponse<PageTotalListResponse<ReturnItem>> returnItemList(ReturnItemListData data) {
        return postWinit("winit.mms.item.return.list", data, new ParameterizedTypeReference<WinitResponse<PageTotalListResponse<ReturnItem>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/48.html">德国地址校验</a>
     */
    public WinitResponse<AddressIsValidResponse> addressIsValid(AddressIsValidData data) {
        return postWinit("winit.tools.address.isValid", data, new ParameterizedTypeReference<WinitResponse<AddressIsValidResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/97.html">订单EGD担保校验</a>
     */
    public WinitResponse<ProductRecommendResponse> productRecommend(ProductRecommendData data) {
        return postWinit("winit.tools.product.recommend", data, new ParameterizedTypeReference<WinitResponse<ProductRecommendResponse>>() {
        });
    }


}
