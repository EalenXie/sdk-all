package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 14:25
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdjudicatePayload {

    /**
     * adjudicationOutcome
     */
    @JsonProperty("adjudication_outcome")
    private String adjudicationOutcome;
}
