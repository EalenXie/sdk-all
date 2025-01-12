package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 14:17
 * @version 1.0
 */
@Getter
@Setter
public class LastPayment {
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
    /**
     * time
     */
    @JsonProperty("time")
    private String time;
}
