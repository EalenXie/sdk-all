package io.github.ealenxie.winit;

import io.github.ealenxie.winit.isp.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 16:49
 */
public class IspClient extends WinitClient {


    protected IspClient(WinitConfig winitConfig) {
        super(winitConfig);
    }

    protected IspClient(WinitConfig winitConfig, RestOperations restOperations) {
        super(winitConfig, restOperations);
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/65.html">创建国内直发小包订单</a>
     */
    public WinitResponse<OrderTrackingNo> createOrder(IspOrderCreateData data) {
        return postWinit("isp.order.createOrder", data, new ParameterizedTypeReference<WinitResponse<OrderTrackingNo>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/316.html">预分拣-获取装箱面单</a>
     */
    public WinitResponse<PackingListResponse> getPackingList(PackingListData data) {
        return postWinit("isp.warehouse.getpackinglist", data, new ParameterizedTypeReference<WinitResponse<PackingListResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/315.html">预分拣-获取装箱面单号</a>
     */
    public WinitResponse<BigPackageNosResponse> getBigPackageNumber(VendorQtyData data) {
        return postWinit("isp.warehouse.getbigpackagenumber", data, new ParameterizedTypeReference<WinitResponse<BigPackageNosResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/73.html">打印发票</a>
     */
    public WinitResponse<FilesResponse> invoiceQuery(String orderNo) {
        return postWinit("winitInvoice.query", new OrderNoData(orderNo), new ParameterizedTypeReference<WinitResponse<FilesResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/67.html">打印面单</a>
     */
    public WinitResponse<LabelResponse> labelQuery(String orderNo) {
        return postWinit("winitLable.query", new OrderNoData(orderNo), new ParameterizedTypeReference<WinitResponse<LabelResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/68.html">确认发货</a>
     */
    public WinitResponse<SuccessResponse> deliveryConfirm(String orderNo) {
        return postWinit("isp.delivery.confirm", new OrderNoData(orderNo), new ParameterizedTypeReference<WinitResponse<SuccessResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/70.html">查询ISP订单详情</a>
     */
    public WinitResponse<IspOrder> orderQuery(IspOrderQueryData data) {
        return postWinit("isp.order.query", data, new ParameterizedTypeReference<WinitResponse<IspOrder>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/72.html">查询物流费用</a>
     */
    public WinitResponse<IspOrderRevenue> getOrderRevenue(String orderNo) {
        return postWinit("isp.order.getOrderRevenue", new OrderNoData(orderNo), new ParameterizedTypeReference<WinitResponse<IspOrderRevenue>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/71.html">查询轨迹</a>
     */
    public WinitResponse<List<OrderTrackingResponse>> getOrderTracking(IspOrderTrackingData data) {
        return postWinit("tracking.getOrderTracking", data, new ParameterizedTypeReference<WinitResponse<List<OrderTrackingResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/69.html">作废订单</a>
     */
    public WinitResponse<IspOrderDisableResponse> orderDisable(List<OrderNoData> data) {
        return postWinit("isp.order.disable", data, new ParameterizedTypeReference<WinitResponse<IspOrderDisableResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/66.html">预估物流费用</a>
     */
    public WinitResponse<FeeCalcEstimateResponse> feeCalcEstimate(FeeCalcEstimateData data) {
        return postWinit("isp.feeCalc.estimate", data, new ParameterizedTypeReference<WinitResponse<FeeCalcEstimateResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/64.html">查询国内验货仓</a>
     */
    public WinitResponse<List<IspWarehouse>> getIspWarehouseList(IspWarehouseListData data) {
        return postWinit("baseData.getISPWarehouseList", data, new ParameterizedTypeReference<WinitResponse<List<IspWarehouse>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/62.html">查询小包物流产品/渠道</a>
     */
    public WinitResponse<List<ProductResponse>> productList(@Nullable ProductListData data) {
        if (data != null && ObjectUtils.isEmpty(data.getWarehouseID()) && ObjectUtils.isEmpty(data.getProductCatalogName())) {
            data = null;
        }
        return postWinit("winitProduct.list", data, new ParameterizedTypeReference<WinitResponse<List<ProductResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/63.html">查询提货地址</a>
     */
    public WinitResponse<ListResponse<PickupService>> getUmsPickupAddress(@Nullable UmsAddressGetData data) {
        return postWinit("ums.address.getByPickupService", data, new ParameterizedTypeReference<WinitResponse<ListResponse<PickupService>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/61.html">新增提货地址</a>
     */
    public WinitResponse<Object> addUmsPickupAddress(@Nullable UmsAddressAddData data) {
        return postWinit("ums.address.add", data, new ParameterizedTypeReference<WinitResponse<Object>>() {
        });
    }
}
