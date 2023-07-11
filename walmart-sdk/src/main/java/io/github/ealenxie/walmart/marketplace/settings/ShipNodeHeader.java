package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:38
 */
@Getter
@Setter
public class ShipNodeHeader {
    /**
     * version
     */
    @JsonProperty("version")
    private String version;
}
