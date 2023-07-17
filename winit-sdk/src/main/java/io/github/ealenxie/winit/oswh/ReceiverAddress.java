package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 11:11
 */
@NoArgsConstructor
@Data
public class ReceiverAddress {
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
     * country
     */
    @JsonProperty("country")
    private String country;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * phone
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * postCode
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
}
