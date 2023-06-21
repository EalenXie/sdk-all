package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Money {

    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency_code")
    private String currencyCode;

}
