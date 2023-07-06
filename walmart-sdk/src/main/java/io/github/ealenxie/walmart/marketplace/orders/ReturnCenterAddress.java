package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:02
 */
@NoArgsConstructor
@Data
public class ReturnCenterAddress {
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
     * dayPhone
     */
    @JsonProperty("dayPhone")
    private String dayPhone;
    /**
     * emailId
     */
    @JsonProperty("emailId")
    private String emailId;
}
