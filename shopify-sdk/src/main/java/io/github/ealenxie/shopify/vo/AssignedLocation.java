package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by EalenXie on 2022/9/27 16:58
 */
@Getter
@Setter
public class AssignedLocation {

    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("location_id")
    private Long locationId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("province")
    private String province;
    @JsonProperty("zip")
    private String zip;


}
