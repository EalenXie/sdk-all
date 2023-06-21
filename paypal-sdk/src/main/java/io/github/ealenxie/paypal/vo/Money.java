package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Money {

    /**
     * 通过PayPal 交易货币的三字符 ISO-4217 货币代码过滤响应中的<a href="https://developer.paypal.com/api/rest/reference/currency-codes/">交易</a>
     */
    @JsonProperty("currency_code")
    private String currencyCode;

    /**
     * 值，可能是：
     * 像这样的货币的整数JPY通常不是小数。
     * 像这样的货币的小数部分TND被细分为千分之一。
     * 有关货币代码所需的小数位数，请参阅<a href="https://developer.paypal.com/reference/currency-codes/">货币代码</a>
     */
    @JsonProperty("value")
    private String value;
}
