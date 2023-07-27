package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class AddressPayload {
    /**
     * addressLine1
     */
    @JsonProperty("address_line_1")
    private String addressLineOne;
    /**
     * addressLine2
     */
    @JsonProperty("address_line_2")
    private String addressLineTwo;
    /**
     * adminArea2
     */
    @JsonProperty("admin_area_2")
    private String adminAreaTwo;
    /**
     * adminArea1
     */
    @JsonProperty("admin_area_1")
    private String adminAreaOne;
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
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
