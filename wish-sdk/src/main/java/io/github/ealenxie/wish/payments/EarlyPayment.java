package io.github.ealenxie.wish.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 10:50
 */
@NoArgsConstructor
@Data
public class EarlyPayment {

    /**
     * availableAmount
     */
    @JsonProperty("available_amount")
    private Money availableAmount;
}
