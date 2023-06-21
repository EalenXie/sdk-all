package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentDetailsDTO {
    @JsonProperty("credit_card_bin")
    private String creditCardBin;
    @JsonProperty("avs_result_code")
    private String avsResultCode;
    @JsonProperty("cvv-result_code")
    private String cvvResultCode;
    @JsonProperty("credit_card_number")
    private String creditCardNumber;
    @JsonProperty("credit_card_company")
    private String creditCardCompany;
    @JsonProperty("buyer_action_info")
    private String buyerActionInfo;
    @JsonProperty("credit_card_name")
    private String creditCardName;
    @JsonProperty("credit_card_wallet")
    private String creditCardWallet;
    @JsonProperty("credit_card_expiration_month")
    private int creditCardExpirationMonth;
    @JsonProperty("credit_card_expiration_year")
    private int creditCardExpirationYear;
}
