package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuyerTaxInformation {
    @JsonProperty("BuyerLegalCompanyName")
    private String buyerLegalCompanyName;
    @JsonProperty("BuyerBusinessAddress")
    private String buyerBusinessAddress;
    @JsonProperty("BuyerTaxRegistrationId")
    private String buyerTaxRegistrationId;
    @JsonProperty("BuyerTaxOffice")
    private String buyerTaxOffice;
}