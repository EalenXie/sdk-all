package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:05
 */
@Getter
@Setter
public class RefundOrderLine {
    /**
     * lineNumber
     */
    @JsonProperty("lineNumber")
    private String lineNumber;
    /**
     * isFullRefund
     */
    @JsonProperty("isFullRefund")
    private Boolean isFullRefund;
    /**
     * refunds
     */
    @JsonProperty("refunds")
    private Refunds refunds;
}
