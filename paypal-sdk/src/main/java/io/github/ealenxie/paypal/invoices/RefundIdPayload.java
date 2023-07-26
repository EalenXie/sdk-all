package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/21 11:06
 */
@Getter
@Setter
public class RefundIdPayload {

    /**
     * refundId
     */
    @JsonProperty("refund_id")
    private String refundId;
}
