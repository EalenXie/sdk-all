package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:17
 */
@Getter
@Setter
public class Breakdown {
    /**
     * itemTotal
     */
    @JsonProperty("item_total")
    private Money itemTotal;
    /**
     * custom
     */
    @JsonProperty("custom")
    private Custom custom;
    /**
     * shipping
     */
    @JsonProperty("shipping")
    private Shipping shipping;
    /**
     * discount
     */
    @JsonProperty("discount")
    private Discount discount;
    /**
     * taxTotal
     */
    @JsonProperty("tax_total")
    private Money taxTotal;
}
