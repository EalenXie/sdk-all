package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/12/15 10:19
 */
@Getter
@Setter
public class Money {
    /**
     * 币种
     */
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    /**
     * 金额
     */
    @JsonProperty("Amount")
    private String amount;
}
