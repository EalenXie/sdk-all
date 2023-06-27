package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 12:40
 */
@Getter
@Setter
public class BalancePayload {
    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 金额
     */
    @JsonProperty("balance")
    private String balance;
}
