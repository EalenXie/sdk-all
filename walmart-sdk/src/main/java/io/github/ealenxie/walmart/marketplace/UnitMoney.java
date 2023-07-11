package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/6 14:28
 */
@Getter
@Setter
public class UnitMoney {
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * amount
     */
    @JsonProperty("amount")
    private BigDecimal amount;

}
