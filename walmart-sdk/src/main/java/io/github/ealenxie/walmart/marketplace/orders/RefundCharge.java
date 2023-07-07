package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:05
 */
@Getter
@Setter
public class RefundCharge {
    /**
     * refundReason
     */
    @JsonProperty("refundReason")
    private String refundReason;
    /**
     * charge
     */
    @JsonProperty("charge")
    private Charge charge;
}
