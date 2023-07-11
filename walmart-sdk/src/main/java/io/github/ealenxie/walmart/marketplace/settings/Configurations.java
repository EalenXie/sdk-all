package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 14:42
 */
@NoArgsConstructor
@Data
public class Configurations {
    /**
     * configurationName
     */
    @JsonProperty("configurationName")
    private String configurationName;
    /**
     * configuration
     */
    @JsonProperty("configuration")
    private Object configuration;
}
