package io.github.ealenxie.wish.euproductcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 13:46
 */
@Getter
@Setter
public class ResponsiblePersonRequestPayload {
    /**
     * addressLine2
     */
    @JsonProperty("address_line2")
    private String addressLine2;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * addressLine1
     */
    @JsonProperty("address_line1")
    private String addressLine1;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * country
     */
    @JsonProperty("country")
    private String country;
    /**
     * zipcode
     */
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * phoneNumber
     */
    @JsonProperty("phone_number")
    private String phoneNumber;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
}
