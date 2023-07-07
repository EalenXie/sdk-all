package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 10:38
 */
@Getter
@Setter
public class CreateLabelFromAddress {
    /**
     * contactName
     */
    @JsonProperty("contactName")
    private String contactName;
    /**
     * companyName
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * addressLine1
     */
    @JsonProperty("addressLine1")
    private String addressLine1;
    /**
     * addressLine2
     */
    @JsonProperty("addressLine2")
    private String addressLine2;
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
     * phone
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;


}
