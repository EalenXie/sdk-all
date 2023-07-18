package io.github.ealenxie.paypal.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/1 10:42
 */
@Getter
@Setter
public class PayPalAccessToken {
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("expires_in")
    private Integer expiresIn;
    @JsonProperty("nonce")
    private String nonce;
}
