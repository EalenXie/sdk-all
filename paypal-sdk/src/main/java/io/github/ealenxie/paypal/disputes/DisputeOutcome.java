package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@NoArgsConstructor
@Data
public class DisputeOutcome {
    /**
     * outcomeCode
     */
    @JsonProperty("outcome_code")
    private String outcomeCode;
    /**
     * amountRefunded
     */
    @JsonProperty("amount_refunded")
    private Money amountRefunded;
}
