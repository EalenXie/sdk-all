package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuyerInfo {
    @JsonProperty("BuyerEmail")
    private String buyerEmail;
    @JsonProperty("BuyerName")
    private String buyerName;
    @JsonProperty("BuyerCounty")
    private String buyerCounty;
    @JsonProperty("BuyerTaxInfo")
    private BuyerTaxInfo buyerTaxInfo;
    @JsonProperty("PurchaseOrderNumber")
    private String purchaseOrderNumber;
}