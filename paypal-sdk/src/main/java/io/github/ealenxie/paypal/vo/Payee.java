package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/28 15:12
 */
@Getter
@Setter
public class Payee {

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("merchant_id")
    private String merchantId;
}
