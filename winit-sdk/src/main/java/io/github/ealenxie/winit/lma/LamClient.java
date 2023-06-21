package io.github.ealenxie.winit.lma;

import io.github.ealenxie.winit.RequireArgs;
import io.github.ealenxie.winit.WinitClient;
import io.github.ealenxie.winit.WinitConfig;
import io.github.ealenxie.winit.WinitResponse;
import io.github.ealenxie.winit.lma.dto.*;
import io.github.ealenxie.winit.lma.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * 尾程相关API
 *
 * @author create by sch  2023/4/21 14:30
 * @version 1.0
 */
public class LamClient extends WinitClient {
    public LamClient() {
    }

    public LamClient(RestOperations restOperations) {
        super(restOperations);
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/201.html">创建LMA订单</a>
     */
    public WinitResponse<CreateLamOrderVO> createOrder(WinitConfig winitConfig, CreateLamOrderDTO createLamOrderDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.create");
        return callWinit(requireArgs, createLamOrderDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<CreateLamOrderVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/309.html">创建LMA订单-sync</a>
     */
    public WinitResponse<CreateLamOrderVO> createOrderSync(WinitConfig winitConfig, CreateLamOrderDTO createLamOrderDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.createOrderSync");
        return callWinit(requireArgs, createLamOrderDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<CreateLamOrderVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/202.html">获取面单</a>
     */
    public WinitResponse<PrintShipmentVO> printShipment(WinitConfig winitConfig, PrintShipmentDTO printShipmentDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.print");
        return callWinit(requireArgs, printShipmentDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<PrintShipmentVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/205.html">批量获取LMA运单号</a>
     */
    public WinitResponse<QueryTrackingNoVO> queryTrackingNos(WinitConfig winitConfig, OrderNoDTO queryTrackingNoDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.get");
        return callWinit(requireArgs, queryTrackingNoDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<QueryTrackingNoVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/303.html">更新订单尺重</a>
     */
    public WinitResponse<UpdateWeightVO> updateWeight(WinitConfig winitConfig, UpdateWeightDTO updateWeightDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.updateWeight");
        return callWinit(requireArgs, updateWeightDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<UpdateWeightVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/169.html">确认发货</a>
     */
    public WinitResponse<ConfirmVO> confirm(WinitConfig winitConfig, OrderNoDTO confirmDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.confirm");
        return callWinit(requireArgs, confirmDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<ConfirmVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/259.html">预估LMA订单费用</a>
     */
    public WinitResponse<CalDeliveryFeeVO> calDeliveryFee(WinitConfig winitConfig, CalDeliveryFeeDTO calDeliveryFeeDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.calDeliveryFee");
        return callWinit(requireArgs, calDeliveryFeeDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<CalDeliveryFeeVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/167.html">查询LMA订单详情</a>
     */
    public WinitResponse<OrderInfoVO> getOrderInfo(WinitConfig winitConfig, QueryOrderInfoDTO queryOrderInfoDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.getOrder");
        return callWinit(requireArgs, queryOrderInfoDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<OrderInfoVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/170.html">取消LMA订单</a>
     */
    public WinitResponse<CancelShipmentVO> cancelShipment(WinitConfig winitConfig, OrderNoDTO cancelDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.cancel");
        return callWinit(requireArgs, cancelDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<CancelShipmentVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/203.html">批量获取面单</a>
     */
    public WinitResponse<BatchPrintVO> batchPrint(WinitConfig winitConfig, OrderNoDTO cancelDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.shipment.batchPrint");
        return callWinit(requireArgs, cancelDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<BatchPrintVO>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/173.html">获取发货单</a>
     */
    public WinitResponse<ManifestPrintVO> manifestPrint(WinitConfig winitConfig, ManifestPrintDTO manifestPrintDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "lma.manifest.print");
        return callWinit(requireArgs, manifestPrintDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<ManifestPrintVO>>() {
        });
    }

}
