package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitAmount;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@Getter
@Setter
public class OrderLine {
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
     * fulfillment
     */
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
}
