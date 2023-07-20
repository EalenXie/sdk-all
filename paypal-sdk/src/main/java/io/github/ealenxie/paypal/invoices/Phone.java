package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class Phone {
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
     * phoneType
     */
    @JsonProperty("phone_type")
    private String phoneType;
}
