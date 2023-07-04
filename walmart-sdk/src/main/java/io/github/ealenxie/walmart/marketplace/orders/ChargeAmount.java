package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie
 * @since 2022/08/04 12:31
 */
@Getter
@Setter
public class ChargeAmount {
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
