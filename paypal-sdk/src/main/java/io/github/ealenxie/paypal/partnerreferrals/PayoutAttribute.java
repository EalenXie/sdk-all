package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:16
 * @version 1.0
 */
@Getter
@Setter
public class PayoutAttribute {
    /**
     * marketplace
     */
    @JsonProperty("marketplace")
    private Boolean marketplace;
    /**
     * kycRequired
     */
    @JsonProperty("kyc_required")
    private Boolean kycRequired;
    /**
     * countryTransferMethodCurrencySelection
     */
    @JsonProperty("country_transfer_method_currency_selection")
    private List<CountryTransferMethodCurrencySelection> countryTransferMethodCurrencySelection;
}
