package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 15:37
 * @version 1.0
 */
@Getter
@Setter
public class Price {
    /**
     * amount
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
}
