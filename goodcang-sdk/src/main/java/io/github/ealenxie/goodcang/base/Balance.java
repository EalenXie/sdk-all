package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 12:39
 */
@Getter
@Setter
public class Balance {
    /**
     * 币种编码
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 金额
     */
    @JsonProperty("amount")
    private String amount;
}
