package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/6 9:45
 */
@Getter
@Setter
public class Money {
    /**
     * 金额
     */
    @JsonProperty("amount")
    private BigDecimal amount;
    /**
     * 货币
     */
    @JsonProperty("currency")
    private String currency;
}
