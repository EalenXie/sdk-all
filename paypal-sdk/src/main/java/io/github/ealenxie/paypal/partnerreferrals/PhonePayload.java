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
public class PhonePayload {
    /**
     * countryCode
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * nationalNumber
     */
    @JsonProperty("national_number")
    private String nationalNumber;
    /**
     * extensionNumber
     */
    @JsonProperty("extension_number")
    private String extensionNumber;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
