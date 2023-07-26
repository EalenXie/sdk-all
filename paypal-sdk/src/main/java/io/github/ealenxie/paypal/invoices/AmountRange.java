package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 10:32
 */
@Getter
@Setter
public class AmountRange {
    /**
     * lowerAmount
     */
    @JsonProperty("lower_amount")
    private Money lowerAmount;
    /**
     * upperAmount
     */
    @JsonProperty("upper_amount")
    private Money upperAmount;
}
