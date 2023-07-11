package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:19
 */
@Getter
@Setter
public class Region {
    /**
     * regionCode
     */
    @JsonProperty("regionCode")
    private String regionCode;
    /**
     * regionName
     */
    @JsonProperty("regionName")
    private String regionName;
}
