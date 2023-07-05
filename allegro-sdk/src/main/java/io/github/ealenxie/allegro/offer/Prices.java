package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 9:48
 * @version 1.0
 */
@Getter
@Setter
public class Prices {
    /**
     * market
     */
    @JsonProperty("market")
    private Money market;
    /**
     * bargain
     */
    @JsonProperty("bargain")
    private Money bargain;
}
