package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/6/25 13:18
 */
@Getter
@Setter
public class Income {
    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 费用
     */
    @JsonProperty("amount")
    private BigDecimal amount;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
}
