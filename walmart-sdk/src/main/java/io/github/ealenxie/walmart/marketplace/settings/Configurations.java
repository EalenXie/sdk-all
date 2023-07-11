package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 14:42
 */
@Getter
@Setter
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
