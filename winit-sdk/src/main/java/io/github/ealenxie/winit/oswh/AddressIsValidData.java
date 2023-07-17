package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 10:59
 */
@Getter
@Setter
public class AddressIsValidData {

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
     * houseNo
     */
    @JsonProperty("houseNo")
    private String houseNo;
    /**
     * street
     */
    @JsonProperty("street")
    private String street;
    /**
     * zipcode
     */
    @JsonProperty("zipcode")
    private String zipcode;
}
