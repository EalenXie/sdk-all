package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/21 13:09
 * @version 1.0
 */
@Getter
@Setter
public class Address {
    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("county")
    private String county;
}
