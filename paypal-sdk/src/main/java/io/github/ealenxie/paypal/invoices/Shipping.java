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
public class Shipping {
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
    /**
     * tax
     */
    @JsonProperty("tax")
    private TaxAmount tax;
}
