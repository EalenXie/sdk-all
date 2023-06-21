package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:39
 */
@Getter
@Setter
public class ReturnCenterAddress {
    @JsonProperty("name")
    private String name;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("dayPhone")
    private String dayPhone;
    @JsonProperty("emailId")
    private String emailId;
}
