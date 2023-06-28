package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Fulfillment {
    /**
     * 订单卖家状态
     * “NEW” “PROCESSING” “READY_FOR_SHIPMENT” “READY_FOR_PICKUP” “SENT” “PICKED_UP” “CANCELLED” “SUSPENDED”
     */
    @JsonProperty("status")
    private String status;
    /**
     * 装运摘要
     */
    @JsonProperty("shipmentSummary")
    private ShipmentSummary shipmentSummary;
}
