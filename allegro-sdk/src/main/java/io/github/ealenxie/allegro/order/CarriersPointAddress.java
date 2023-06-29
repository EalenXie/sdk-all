package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 10:13
 */
@Getter
@Setter
public class CarriersPointAddress {
    /**
     * postCode
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * street
     */
    @JsonProperty("street")
    private String street;
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
