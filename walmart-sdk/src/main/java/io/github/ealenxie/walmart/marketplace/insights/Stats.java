package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@Getter
@Setter
public class Stats {
    /**
     * orders
     */
    @JsonProperty("orders")
    private String orders;
    /**
     * conversionRate
     */
    @JsonProperty("conversionRate")
    private String conversionRate;
    /**
     * gmvAmount
     */
    @JsonProperty("gmvAmount")
    private Money gmvAmount;
    /**
     * totalUnits
     */
    @JsonProperty("totalUnits")
    private String totalUnits;
}
