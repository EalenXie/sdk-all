package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 14:16
 */
@NoArgsConstructor
@Data
public class ConfigurationCategory {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * fulfillmentLagTime
     */
    @JsonProperty("fulfillmentLagTime")
    private Integer fulfillmentLagTime;
}
