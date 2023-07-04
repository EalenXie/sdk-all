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
     * <a href="https://developer.winit.com.cn/document/detail/id/44.html">查询总库存</a>
     *
     * @param payload 请求入参
     */
    public WinitResponse<WarehouseStorageResp> queryWarehouseStorage(QueryWarehouseStorage payload) {
        return postWinit("queryWarehouseStorage", payload, new ParameterizedTypeReference<WinitResponse<WarehouseStorageResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/297.html">查询分类库存</a>
     */
    public WinitResponse<WinItInventoryTypeResp> queryWinItInventoryType(QueryWinItInventoryType payload) {
        return postWinit("winit.inventory.type.pageInv", payload, new ParameterizedTypeReference<WinitResponse<WinItInventoryTypeResp>>() {
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
     * <a href="https://developer.winit.com.cn/document/detail/id/231.html">查询仓租单明细</a>
     */
    public WinitResponse<WareHouseReceiptDetailsResp> queryWarehouseReceiptDetails(QueryWarehouseReceiptDetails payload) {
        return postWinit("winit.ims.queryWarehouseReceiptDetails", payload, new ParameterizedTypeReference<WinitResponse<WareHouseReceiptDetailsResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/254.html">库存流水查询</a>
     */
    public WinitResponse<InventoryStatementResp> queryInventoryStatement(QueryInventoryStatement payload) {
        return postWinit("winit.inventory.pageInvInouts", payload, new ParameterizedTypeReference<WinitResponse<InventoryStatementResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/17.html">查询商品信息</a>
     */
    public WinitResponse<CommodityInfoResponse> queryCommodityInfo(QueryCommodityInfo payload) {
        return postWinit("winit.mms.item.list", payload, new ParameterizedTypeReference<WinitResponse<CommodityInfoResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/15.html">注册/编辑商品</a>
     */
    public WinitResponse<List<RegisterProduct>> registerProduct(ProductsPayload payload) {
        return postWinit("registerProduct", payload, new ParameterizedTypeReference<WinitResponse<List<RegisterProduct>>>() {
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
     * <a href="https://developer.winit.com.cn/document/detail/id/141.html">创建入库单</a>
     */
    public WinitResponse<OrderNoPayload> createOrder(InboundOrderPayload payload) {
        return postWinit("winit.wh.inbound.order.create", payload, new ParameterizedTypeReference<WinitResponse<OrderNoPayload>>() {
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
     * <a href="https://developer.winit.com.cn/document/detail/id/285.html">作废入库单</a>
     */
    public WinitResponse<Void> cancelOrder(CancelOrderPayload payload) {
        return postWinit("winit.wh.inbound.voidOrder", payload, new ParameterizedTypeReference<WinitResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/39.html">查询入库单详情</a>
     */
    public WinitResponse<OrderResponse> getOrderDetail(QueryOrderDetail payload) {
        return postWinit("winit.wh.inbound.getOrderDetail", payload, new ParameterizedTypeReference<WinitResponse<OrderResponse>>() {
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
     * <a href="https://developer.winit.com.cn/document/detail/id/31.html">打印包裹标签</a>
     */
    public WinitResponse<LabelPayload> printPackageLabel(PrintPackageLabelPayload payload) {
        return postWinit("winit.wh.inbound.printPackageLabel", payload, new ParameterizedTypeReference<WinitResponse<LabelPayload>>() {
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
     * <a href="https://developer.winit.com.cn/document/detail/id/247.html">创建出库单-新</a>
     */
    public WinitResponse<CreateOutboundOrderResponse> createSubmittedOrder(CreateOutboundOrderPayload payload) {
        return postWinit("wh.outbound.createSubmittedOrder", payload, new ParameterizedTypeReference<WinitResponse<CreateOutboundOrderResponse>>() {
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
    public WinitResponse<OutboundOrderFeeResponse> queryOutboundOrderFee(QueryOrderFeePayload payload) {
        return postWinit("sms.incomeSettlement.queryOutboundOrderFee", payload, new ParameterizedTypeReference<WinitResponse<OutboundOrderFeeResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/276.html">作废出库单</a>
     */
    public WinitResponse<String> cancelOutboundOrder(OutboundOrderNumPayload payload) {
        return postWinit("voidOutboundOrder", payload, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }

}