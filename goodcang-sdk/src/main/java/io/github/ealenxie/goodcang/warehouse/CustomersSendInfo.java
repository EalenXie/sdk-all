package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 9:50
 */
@Getter
@Setter
public class CustomersSendInfo {
    /**
     * 预计到达中转仓时间
     */
    @JsonProperty("arrive_transfer_warehouse_time")
    private String arriveTransferWarehouseTime;
    /**
     * 快递公司名称
     */
    @JsonProperty("company_name")
    private String companyName;
    /**
     * 快递单号
     */
    @JsonProperty("delivery_code")
    private String deliveryCode;
    /**
     * 司机姓名
     */
    @JsonProperty("driver_name")
    private String driverName;
    /**
     * 司机电话
     */
    @JsonProperty("driver_phone")
    private String driverPhone;
    /**
     * 车牌号
     */
    @JsonProperty("plate_no")
    private String plateNo;
}
