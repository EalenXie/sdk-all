package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
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
