package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 14:16
 */
@Getter
@Setter
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
