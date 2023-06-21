package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 15:10
 */
@Getter
@Setter
public class PickupInfoVO {
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("country")
    private String country;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("district")
    private String district;
    @JsonProperty("street")
    private String street;
    @JsonProperty("detail_address")
    private String detailAddress;
    @JsonProperty("zip_code")
    private String zipCode;


}
