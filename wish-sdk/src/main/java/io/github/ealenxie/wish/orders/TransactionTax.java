package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class TransactionTax {
    @JsonProperty("tax_amount_in_merchant_currency")
    private Money taxAmountInMerchantCurrency;
    @JsonProperty("tax_amount_in_authority_currency")
    private Money taxAmountInAuthorityCurrency;
    @JsonProperty("tax_type")
    private String taxType;
    @JsonProperty("remit_type")
    private String remitType;
}
