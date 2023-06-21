package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class PhoneNumber {
    @JsonProperty("number")
    private String number;
    @JsonProperty("country_code")
    private String countryCode;
}
