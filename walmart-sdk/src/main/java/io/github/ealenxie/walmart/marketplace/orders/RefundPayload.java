package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:05
 */
@NoArgsConstructor
@Data
public class RefundPayload {
    /**
     * refundComments
     */
    @JsonProperty("refundComments")
    private String refundComments;
    /**
     * refundCharges
     */
    @JsonProperty("refundCharges")
    private RefundCharges refundCharges;
}
