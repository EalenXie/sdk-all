package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/1 10:59
 */
@Getter
@Setter
public class TotalFunds {
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
     * 转换币种
     */
    @JsonProperty("convertedFromCurrency")
    private String convertedFromCurrency;
    /**
     * 转换金额
     */
    @JsonProperty("convertedFromValue")
    private String convertedFromValue;
    /**
     * 转换汇率
     */
    @JsonProperty("exchangeRate")
    private String exchangeRate;
}
