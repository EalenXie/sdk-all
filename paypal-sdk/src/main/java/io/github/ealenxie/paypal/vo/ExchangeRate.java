package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/28 16:14
 */
@Getter
@Setter
public class ExchangeRate {
    @JsonProperty("source_currency")
    private String sourceCurrency;
    @JsonProperty("target_currency")
    private String targetCurrency;
    @JsonProperty("value")
    private String value;
}
