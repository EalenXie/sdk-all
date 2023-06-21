package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 小小怪下士
 * @version 1.0.0
 */
@Getter
@Setter
public class Address {
    @JsonProperty("street_address")
    private String streetAddress;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("region")
    private String region;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("country")
    private String country;
}
