package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class BreakdownPayload {
    /**
     * custom
     */
    @JsonProperty("custom")
    private Custom custom;
    /**
     * shipping
     */
    @JsonProperty("shipping")
    private ShippingPayload shipping;
    /**
     * discount
     */
    @JsonProperty("discount")
    private DiscountPayload discount;
}
