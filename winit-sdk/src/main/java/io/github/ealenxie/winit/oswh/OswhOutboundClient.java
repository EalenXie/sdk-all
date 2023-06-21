package io.github.ealenxie.winit.oswh;

import io.github.ealenxie.winit.RequireArgs;
import io.github.ealenxie.winit.WinitClient;
import io.github.ealenxie.winit.WinitConfig;
import io.github.ealenxie.winit.WinitResponse;
import io.github.ealenxie.winit.oswh.outbound.dto.*;
import io.github.ealenxie.winit.oswh.outbound.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * 出库相关API
 *
 * @author create by sch  2023/4/20 16:35
 * @version 1.0
 */
public class OswhOutboundClient extends WinitClient {

    public OswhOutboundClient() {
    }

    public OswhOutboundClient(RestOperations restOperations) {
        super(restOperations);
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/247.html">创建出库单-新</a>
     */
    public WinitResponse<CreateOutboundOrderResp> createSubmittedOrder(WinitConfig winitConfig, CreateOutboundOrderDTO outboundOrderDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "wh.outbound.createSubmittedOrder");
        return callWinit(requireArgs, outboundOrderDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<CreateOutboundOrderResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/96.html">预估派送运费-3</a>
     */
    public WinitResponse<CalcDeliveryFeeResp> calcDeliveryFee(WinitConfig winitConfig, CalcDeliveryFeeDTO calcDeliveryFeeDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "wh.outbound.calcDeliveryFee");
        return callWinit(requireArgs, calcDeliveryFeeDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<CalcDeliveryFeeResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/299.html">出库上传附件</a>
     */
    public WinitResponse<String> uploadLabel(WinitConfig winitConfig, UploadLabelDTO uploadLabelDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "pis.orderLabel.uploadLabel");
        return callWinit(requireArgs, uploadLabelDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/54.html">查询出库单（列表）</a>
     */
    public WinitResponse<OutboundOrderResp<OutboundOrderVO>> queryOutboundOrderList(WinitConfig winitConfig, QueryOutboundOrderDTO queryOutboundOrderDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "queryOutboundOrderList");
        return callWinit(requireArgs, queryOutboundOrderDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<OutboundOrderResp<OutboundOrderVO>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/55.html">查询出库单</a>
     */
    public WinitResponse<OutboundOrderResp<OutboundOrderInfoVO>> queryOutboundOrder(WinitConfig winitConfig, OutboundOrderNumDTO outboundOrderNum) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "queryOutboundOrder");
        return callWinit(requireArgs, outboundOrderNum, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<OutboundOrderResp<OutboundOrderInfoVO>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/145.html">查询派送费用</a>
     */
    public WinitResponse<OutboundOrderFeeResp> queryOutboundOrderFee(WinitConfig winitConfig, QueryOrderFeeDTO queryOrderFeeDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "sms.incomeSettlement.queryOutboundOrderFee");
        return callWinit(requireArgs, queryOrderFeeDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<OutboundOrderFeeResp>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/276.html">作废出库单</a>
     */
    public WinitResponse<String> cancelOutboundOrder(WinitConfig winitConfig, OutboundOrderNumDTO outboundOrderNumDTO) {
        RequireArgs requireArgs = getRequireArgs(winitConfig, "voidOutboundOrder");
        return callWinit(requireArgs, outboundOrderNumDTO, HttpMethod.POST, new ParameterizedTypeReference<WinitResponse<String>>() {
        });
    }

}
