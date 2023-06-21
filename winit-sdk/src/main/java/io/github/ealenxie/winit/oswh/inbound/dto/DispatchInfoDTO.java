package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/2 15:21
 **/
@Getter
@Setter
public class DispatchInfoDTO {

    /**
     * 验货方式
     * VI-上门验货（已停用）
     * WI-验货仓验货
     */
    @JsonProperty("inspectionType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inspectionType;
    /**
     * 提货方式
     * 上门提货：P，
     * 自发物流：S
     */
    @JsonProperty("pickupType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pickupType;
    /**
     * 提货开始时间
     * 格式：yyyy-MM-dd HH:mm:ss，下列情况下必填：
     * 1，验货方式为上门验货；
     * 2，验货方式为验货仓验货并且提货方式为上门提货
     */
    @JsonProperty("reservePickupDateFrom")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reservePickupDateFrom;
    /**
     * 提货结束时间
     * 格式：yyyy-MM-dd HH:mm:ss，下列情况下必填：
     * 1，验货方式为上门验货；
     * 2，验货方式为验货仓验货并且提货方式为上门提货
     */
    @JsonProperty("reservePickupDateTo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reservePickupDateTo;
    /**
     * 提货/验货地址编码
     * 下列情况下必填：
     * 1，验货方式为上门验货；
     * 2，验货方式为验货仓验货并且提货方式为上门提货
     */
    @JsonProperty("pickupAddressCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pickupAddressCode;
    /**
     * 发货供应商编码
     * 提货方式(pickupType)为自发物流(S)时，发货供应商编码和发货供应商名称其中之一必填,
     * 取 [查询发货供应商]的承运人编码
     */
    @JsonProperty("expressVendorCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expressVendorCode;
    /**
     * 发货供应商名称
     * 提货方式(pickupType)为自发物流(S)时，发货供应商编码和发货供应商名称其中之一必填,
     * 取 [查询发货供应商]的承运人名称
     */
    @JsonProperty("expressVendorName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expressVendorName;
    /**
     * 快递单号
     * 提货方式(pickupType)为自发物流(S)时必填
     */
    @JsonProperty("expressNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expressNo;

}

