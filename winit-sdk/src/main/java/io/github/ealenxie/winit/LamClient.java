package io.github.ealenxie.winit;

import io.github.ealenxie.winit.lma.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

/**
 * 尾程相关API
 *
 * @author create by sch  2023/4/21 14:30
 * @version 1.0
 */
public class LamClient extends WinitClient {
    public LamClient(WinitConfig winitConfig) {
        super(winitConfig);
    }

    public LamClient(WinitConfig winitConfig, RestOperations restOperations) {
        super(winitConfig, restOperations);
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/201.html">创建LMA订单</a>
     */
    public WinitResponse<OrderNoPayload> createOrder(CreateLamOrderPayload payload) {
        return postWinit("lma.shipment.create", payload, new ParameterizedTypeReference<WinitResponse<OrderNoPayload>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/309.html">创建LMA订单-sync</a>
     */
    public WinitResponse<OrderNoPayload> createOrderSync(CreateLamOrderPayload payload) {
        return postWinit("lma.shipment.createOrderSync", payload, new ParameterizedTypeReference<WinitResponse<OrderNoPayload>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/202.html">获取面单</a>
     */
    public WinitResponse<PrintShipmentResponse> printShipment(WinitOrderNoPayload payload) {
        return postWinit("lma.shipment.print", payload, new ParameterizedTypeReference<WinitResponse<PrintShipmentResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/205.html">批量获取LMA运单号</a>
     */
    public WinitResponse<TrackingNosResponse> queryTrackingNos(OrderNosPayload payload) {
        return postWinit("lma.shipment.get", payload, new ParameterizedTypeReference<WinitResponse<TrackingNosResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/303.html">更新订单尺重</a>
     */
    public WinitResponse<UpdateWeightResponse> updateWeight(UpdateWeightPayload payload) {
        return postWinit("lma.shipment.updateWeight", payload, new ParameterizedTypeReference<WinitResponse<UpdateWeightResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/169.html">确认发货</a>
     */
    public WinitResponse<ConfirmResponse> confirm(OrderNosPayload payload) {
        return postWinit("lma.shipment.confirm", payload, new ParameterizedTypeReference<WinitResponse<ConfirmResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/259.html">预估LMA订单费用</a>
     */
    public WinitResponse<CalDeliveryFeeResponse> calDeliveryFee(CalDeliveryFeePayload payload) {
        return postWinit("lma.shipment.calDeliveryFee", payload, new ParameterizedTypeReference<WinitResponse<CalDeliveryFeeResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/167.html">查询LMA订单详情</a>
     */
    public WinitResponse<OrderInfoResponse> getOrderInfo(QueryOrderInfoPayload payload) {
        return postWinit("lma.shipment.getOrder", payload, new ParameterizedTypeReference<WinitResponse<OrderInfoResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/170.html">取消LMA订单</a>
     */
    public WinitResponse<CancelShipmentResponse> cancelShipment(OrderNosPayload payload) {
        return postWinit("lma.shipment.cancel", payload, new ParameterizedTypeReference<WinitResponse<CancelShipmentResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/203.html">批量获取面单</a>
     */
    public WinitResponse<BatchPrintResponse> batchPrint(OrderNosPayload payload) {
        return postWinit("lma.shipment.batchPrint", payload, new ParameterizedTypeReference<WinitResponse<BatchPrintResponse>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/173.html">获取发货单</a>
     */
    public WinitResponse<ManifestPrintResponse> manifestPrint(ManifestPrintPayload payload) {
        return postWinit("lma.manifest.print", payload, new ParameterizedTypeReference<WinitResponse<ManifestPrintResponse>>() {
        });
    }

}
