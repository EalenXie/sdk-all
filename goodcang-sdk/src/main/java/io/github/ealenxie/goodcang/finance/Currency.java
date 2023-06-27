package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 11:24
 */
@Getter
@Setter
public class Currency {

    /**
     * 货币缩写
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 货币名称
     */
    @JsonProperty("currency_name")
    private String currencyName;
    /**
     * 货币标识符
     */
    @JsonProperty("symbol")
    private String symbol;
}
