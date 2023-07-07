package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 10:47
 */
@NoArgsConstructor
@Data
public class ShippingEstimateFromAddress {
    /**
     * postalCode
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * addressLines
     */
    @JsonProperty("addressLines")
    private List<String> addressLines;
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
}
