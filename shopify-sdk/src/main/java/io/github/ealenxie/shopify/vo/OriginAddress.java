package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/26 15:16
 */
@Getter
@Setter
public class OriginAddress {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("province_code")
    private String provinceCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;
}
