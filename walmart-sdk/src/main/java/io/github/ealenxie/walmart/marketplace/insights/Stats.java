package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
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
    private GmvAmount gmvAmount;
    /**
     * totalUnits
     */
    @JsonProperty("totalUnits")
    private String totalUnits;
}
