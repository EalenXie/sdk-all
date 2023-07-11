package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@Getter
@Setter
public class Address {
    /**
     * line1
     */
    @JsonProperty("line1")
    private String line1;
    /**
     * line2
     */
    @JsonProperty("line2")
    private String line2;
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
     * zip
     */
    @JsonProperty("zip")
    private String zip;
    /**
     * addressType
     */
    @JsonProperty("addressType")
    private String addressType;
}
