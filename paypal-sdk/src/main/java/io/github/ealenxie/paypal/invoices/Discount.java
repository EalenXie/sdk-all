package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:17
 */
@NoArgsConstructor
@Data
public class Discount {
    /**
     * itemDiscount
     */
    @JsonProperty("item_discount")
    private Money itemDiscount;
    /**
     * invoiceDiscount
     */
    @JsonProperty("invoice_discount")
    private PercentMoney invoiceDiscount;
}
