package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
public class AmountPayload {
    /**
     * breakdown
     */
    @JsonProperty("breakdown")
    private BreakdownPayload breakdown;
}
