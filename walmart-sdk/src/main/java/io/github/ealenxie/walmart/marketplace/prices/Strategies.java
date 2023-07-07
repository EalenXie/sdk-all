package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 16:59
 * @version 1.0
 */
@Getter
@Setter
public class Strategies {
    /**
     * strategyType
     */
    @JsonProperty("strategyType")
    private String strategyType;
    /**
     * adjustmentType
     */
    @JsonProperty("adjustmentType")
    private String adjustmentType;
    /**
     * adjustmentValue
     */
    @JsonProperty("adjustmentValue")
    private Double adjustmentValue;
}
