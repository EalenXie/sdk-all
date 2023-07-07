package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitAmount;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:21
 */
@Getter
@Setter
public class CancelOrderLineStatus {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * cancellationReason
     */
    @JsonProperty("cancellationReason")
    private String cancellationReason;
    /**
     * statusQuantity
     */
    @JsonProperty("statusQuantity")
    private UnitAmount statusQuantity;
}
