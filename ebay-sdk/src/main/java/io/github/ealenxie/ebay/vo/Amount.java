package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@Getter
@Setter
public class Amount {
    /**
     * 金额
     */
    @JsonProperty("value")
    private String value;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 转换后的金额
     */
    @JsonProperty("convertedFromValue")
    private String convertedFromValue;
    /**
     * 转换币种
     */
    @JsonProperty("convertedFromCurrency")
    private String convertedFromCurrency;
    /**
     * 用于货币转换的汇率
     */
    @JsonProperty("exchangeRate")
    private String exchangeRate;
}
