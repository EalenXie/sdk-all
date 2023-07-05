package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.MoneyValuePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 10:28
 * @version 1.0
 */
@Getter
@Setter
public class BadgePrices {
    /**
     * bargain
     */
    @JsonProperty("bargain")
    private MoneyValuePayload bargain;
}
