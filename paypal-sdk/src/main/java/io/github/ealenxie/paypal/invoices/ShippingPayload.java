package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class ShippingPayload {
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
    /**
     * tax
     */
    @JsonProperty("tax")
    private Tax tax;
}
