package io.github.ealenxie.winit.oswh;

import io.github.ealenxie.winit.RequireArgs;
import io.github.ealenxie.winit.WinitClient;
import io.github.ealenxie.winit.WinitConfig;
import io.github.ealenxie.winit.WinitResponse;
import io.github.ealenxie.winit.oswh.inbound.dto.*;
import io.github.ealenxie.winit.oswh.inbound.vo.InboundOrderVO;
import io.github.ealenxie.winit.oswh.inbound.vo.OrderVO;
import io.github.ealenxie.winit.oswh.inbound.vo.PrintPackageLabelVO;
import io.github.ealenxie.winit.oswh.inbound.vo.WinItProductsVO;
import io.github.ealenxie.winit.oswh.inventory.dto.*;
import io.github.ealenxie.winit.oswh.inventory.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * Created by EalenXie on 2023/1/20 12:18
 * <a href="https://developer.winit.com.cn/document/detail/id/99.html">海外仓服务API</a>
 */
public class OswhClient extends WinitClient {

    public OswhClient() {
    }

    public OswhClient(RestOperations restOperations) {
        super(restOperations);
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/44.html">查询总库存</a>
     *
     * @param queryWarehouseStorage 请求入参
     */
    public WinitResponse<WarehouseStorageResp> queryWarehouseStorage(WinitConfig winitConfig, QueryWarehouseStorage queryWarehouseStorage) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "queryWarehouseStorage");
        return callWinit(requireArgs, queryWarehouseStorage, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<WarehouseStorageResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/297.html">查询分类库存</a>
     */
    public WinitResponse<WinItInventoryTypeResp> queryWinItInventoryType(WinitConfig winitConfig, QueryWinItInventoryType queryWinItInventoryType) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.inventory.type.pageInv");
        return callWinit(requireArgs, queryWinItInventoryType, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<WinItInventoryTypeResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/58.html">查询总库存（含DOI）</a>
     */
    public WinitResponse<ProductInventoryResp> queryProductInventoryList4Page(WinitConfig winitConfig, QueryProductInventory queryProductInventory) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "queryProductInventoryList4Page");
        return callWinit(requireArgs, queryProductInventory, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<ProductInventoryResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/231.html">查询仓租单明细</a>
     */
    public WinitResponse<WareHouseReceiptDetailsResp> queryWarehouseReceiptDetails(WinitConfig winitConfig, QueryWarehouseReceiptDetails queryWarehouseReceiptDetails) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.ims.queryWarehouseReceiptDetails");
        return callWinit(requireArgs, queryWarehouseReceiptDetails, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<WareHouseReceiptDetailsResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/254.html">库存流水查询</a>
     */
    public WinitResponse<InventoryStatementResp> queryInventoryStatement(WinitConfig winitConfig, QueryInventoryStatement queryInventoryStatement) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.inventory.pageInvInouts");
        return callWinit(requireArgs, queryInventoryStatement, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<InventoryStatementResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/17.html">查询商品信息</a>
     */
    public WinitResponse<CommodityInfoResp> queryCommodityInfo(WinitConfig winitConfig, QueryCommodityInfo queryCommodityInfo) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.mms.item.list");
        return callWinit(requireArgs, queryCommodityInfo, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<CommodityInfoResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/15.html">注册/编辑商品</a>
     */
    public WinitResponse<List<RegisterProduct>> registerProduct(WinitConfig winitConfig, ProductInfosDTO productInfosDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "registerProduct");
        return callWinit(requireArgs, productInfosDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<List<RegisterProduct>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/43.html">查询仓库代码</a>
     */
    public WinitResponse<List<WarehouseVO>> queryWarehouse(WinitConfig winitConfig) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "queryWarehouse");
        return callWinit(requireArgs, null, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<List<WarehouseVO>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/141.html">创建入库单</a>
     */
    public WinitResponse<InboundOrderVO> createOrder(WinitConfig winitConfig, InboundOrderDTO inboundOrderDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.wh.inbound.order.create");
        return callWinit(requireArgs, inboundOrderDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<InboundOrderVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/28.html">查询头程服务</a>
     */
    public WinitResponse<List<WinItProductsVO>> getWinItProducts(WinitConfig winitConfig, QueryWinItProducts productsDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.wh.pms.getWinitProducts");
        return callWinit(requireArgs, productsDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<List<WinItProductsVO>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/285.html">作废入库单</a>
     */
    public WinitResponse<Void> cancelOrder(WinitConfig winitConfig, CancelOrderDTO cancelOrderDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.wh.inbound.voidOrder");
        return callWinit(requireArgs, cancelOrderDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/39.html">查询入库单详情</a>
     */
    public WinitResponse<OrderVO> getOrderDetail(WinitConfig winitConfig, QueryOrderDetail orderDetail) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.wh.inbound.getOrderDetail");
        return callWinit(requireArgs, orderDetail, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<OrderVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/300.html">直发入库-确认发货</a>
     */
    public WinitResponse<OrderVO> confirmShipment(WinitConfig winitConfig, ConfirmShipmentDTO dto) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.wh.inbound.shipment.confirm");
        return callWinit(requireArgs, dto, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<OrderVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/31.html">打印包裹标签</a>
     */
    public WinitResponse<PrintPackageLabelVO> printPackageLabel(WinitConfig winitConfig, PrintPackageLabelDTO printPackageLabelDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.wh.inbound.printPackageLabel");
        return callWinit(requireArgs, printPackageLabelDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<PrintPackageLabelVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/19.html">打印商品条码标签</a>
     */
    public WinitResponse<String> printProductLabel(WinitConfig winitConfig, PrintProductLabelDTO productLabelDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "winit.singleitem.label.print");
        return callWinit(requireArgs, productLabelDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }
}
