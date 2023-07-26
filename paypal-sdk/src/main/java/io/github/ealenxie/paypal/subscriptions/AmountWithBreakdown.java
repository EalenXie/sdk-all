package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 15:41
 * @version 1.0
 */
@Getter
@Setter
public class AmountWithBreakdown {
    /**
     * grossAmount
     */
    @JsonProperty("gross_amount")
    private Money grossAmount;
    /**
     * feeAmount
     */
    @JsonProperty("fee_amount")
    private Money feeAmount;
    /**
     * netAmount
     */
    @JsonProperty("net_amount")
    private Money netAmount;
}
