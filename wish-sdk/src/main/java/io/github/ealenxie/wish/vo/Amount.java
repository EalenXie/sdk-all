package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class Amount {
    @SuppressWarnings("all")
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("currency_code")
    private String currencyCode;
}
