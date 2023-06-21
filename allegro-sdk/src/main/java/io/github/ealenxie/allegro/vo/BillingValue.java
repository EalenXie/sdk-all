package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BillingValue {
    /**
     * 金额
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
}
