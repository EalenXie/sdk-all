package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:34
 */
@Getter
@Setter
public class OrderLineStatus {
    @JsonProperty("trackingInfo")
    private TrackingInfo trackingInfo;
    /**
     * "Created" "Acknowledged" "Shipped" "Delivered" "Cancelled" "Refund"
     * <p>
     * By Xy
     */
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusQuantity")
    private StatusQuantity statusQuantity;
}
