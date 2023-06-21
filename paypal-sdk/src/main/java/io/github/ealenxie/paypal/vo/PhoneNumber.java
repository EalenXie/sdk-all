package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/7 16:33
 */
@Getter
@Setter
public class PhoneNumber {

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("national_number")
    private String nationalNumber;

    @JsonProperty("extension_number")
    private String extensionNumber;


}
