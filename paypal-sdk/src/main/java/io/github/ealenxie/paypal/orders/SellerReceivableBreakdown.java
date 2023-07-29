package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 10:10
 */
@Getter
@Setter
public class SellerReceivableBreakdown {
    /**
     * grossAmount
     */
    @JsonProperty("gross_amount")
    private Money grossAmount;
    /**
     * paypalFee
     */
    @JsonProperty("paypal_fee")
    private Money paypalFee;
    /**
     * netAmount
     */
    @JsonProperty("net_amount")
    private Money netAmount;
}
