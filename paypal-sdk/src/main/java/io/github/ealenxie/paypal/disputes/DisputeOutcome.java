package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@Getter
@Setter
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
