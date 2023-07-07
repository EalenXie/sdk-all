package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:22
 * @version 1.0
 */
@Getter
@Setter
public class StrategyItem {
    /**
     * strategy
     */
    @JsonProperty("Strategy")
    private Strategy strategy;
}
