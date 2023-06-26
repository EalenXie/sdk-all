package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/26 14:24
 */
@NoArgsConstructor
@Data
public class ModifyExFulfilmentPayload {


    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 期望到货时间
     */
    @JsonProperty("estimated_arrival_date")
    private String estimatedArrivalDate;
    /**
     * 期望到货时间
     */
    @JsonProperty("estimated_arrival_time")
    private String estimatedArrivalTime;
    /**
     * 收件人地址信息
     */
    @JsonProperty("address")
    private Address address;
    /**
     * 物流信息
     */
    @JsonProperty("fulfilment_info")
    private FulfilmentInfo fulfilmentInfo;
    /**
     * 税务信息
     */
    @JsonProperty("tax_info")
    private TaxInfo taxInfo;
    /**
     * 卡派渠道物流信息
     */
    @JsonProperty("truck_info")
    private TruckInfo truckInfo;
}
