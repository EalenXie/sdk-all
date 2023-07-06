package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitAmount;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:13
 */
@NoArgsConstructor
@Data
public class RefundOrderLineResponse {
    /**
     * lineNumber
     */
    @JsonProperty("lineNumber")
    private String lineNumber;
    /**
     * item
     */
    @JsonProperty("item")
    private Item item;
    /**
     * charges
     */
    @JsonProperty("charges")
    private Charges charges;
    /**
     * orderLineQuantity
     */
    @JsonProperty("orderLineQuantity")
    private UnitAmount orderLineQuantity;
    /**
     * statusDate
     */
    @JsonProperty("statusDate")
    private Long statusDate;
    /**
     * orderLineStatuses
     */
    @JsonProperty("orderLineStatuses")
    private OrderLineStatuses orderLineStatuses;
    /**
     * refund
     */
    @JsonProperty("refund")
    private RefundPayload refund;
}
