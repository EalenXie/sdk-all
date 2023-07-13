package io.github.ealenxie.wish.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 10:50
 */
@Getter
@Setter
public class EarlyPayment {

    /**
     * availableAmount
     */
    @JsonProperty("available_amount")
    private Money availableAmount;
}
