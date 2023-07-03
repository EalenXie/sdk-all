package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 10:38
 * @version 1.0
 */
@Getter
@Setter
public class Address {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * street
     */
    @JsonProperty("street")
    private String street;
    /**
     * postCode
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
}
