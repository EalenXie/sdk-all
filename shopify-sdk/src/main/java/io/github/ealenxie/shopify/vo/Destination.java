package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/27 16:58
 */
@Getter
@Setter
public class Destination {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private Object address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("company")
    private String company;
    @JsonProperty("country")
    private String country;
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("province")
    private String province;
    @JsonProperty("zip")
    private String zip;
}
