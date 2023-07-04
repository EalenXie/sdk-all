package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 10:32
 * @version 1.0
 */
@Getter
@Setter
public class PointAddress {
    /**
     * street
     */
    @JsonProperty("street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String street;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * zipCode
     */
    @JsonProperty("zipCode")
    private String zipCode;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * coordinates
     */
    @JsonProperty("coordinates")
    private Coordinates coordinates;
}
