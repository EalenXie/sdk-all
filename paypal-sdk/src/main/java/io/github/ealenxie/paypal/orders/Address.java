package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 10:10
 */
@Getter
@Setter
public class Address {
    /**
     * addressLine1
     */
    @JsonProperty("address_line_1")
    private String addressLine1;
    /**
     * addressLine2
     */
    @JsonProperty("address_line_2")
    private String addressLine2;
    /**
     * adminArea2
     */
    @JsonProperty("admin_area_2")
    private String adminArea2;
    /**
     * adminArea1
     */
    @JsonProperty("admin_area_1")
    private String adminArea1;
    /**
     * postalCode
     */
    @JsonProperty("postal_code")
    private String postalCode;
    /**
     * countryCode
     */
    @JsonProperty("country_code")
    private String countryCode;
}
