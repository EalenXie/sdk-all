package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:32
 */
@Getter
@Setter
public class PostalAddress {
    /**
     * addressLine1
     */
    @JsonProperty("addressLine1")
    private String addressLine1;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * country
     */
    @JsonProperty("country")
    private String country;
    /**
     * postalCode
     */
    @JsonProperty("postalCode")
    private String postalCode;
}
