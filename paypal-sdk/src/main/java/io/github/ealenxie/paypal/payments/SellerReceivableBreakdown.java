package io.github.ealenxie.paypal.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/28 16:14
 */
@Getter
@Setter
public class SellerReceivableBreakdown {
    @JsonProperty("gross_amount")
    private Money grossAmount;
    @JsonProperty("paypal_fee")
    private Money paypalFee;
    @JsonProperty("net_amount")
    private Money netAmount;
    @JsonProperty("receivable_amount")
    private Money receivableAmount;
    @JsonProperty("paypal_fee_in_receivable_currency")
    private Money paypalFeeInReceivableCurrency;
    @JsonProperty("exchange_rate")
    private ExchangeRate exchangeRate;
}
