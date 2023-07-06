package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@NoArgsConstructor
@Data
public class PostalAddress {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * address1
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * address2
     */
    @JsonProperty("address2")
    private String address2;
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
     * postalCode
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * country
     */
    @JsonProperty("country")
    private String country;
    /**
     * addressType
     */
    @JsonProperty("addressType")
    private String addressType;
}
