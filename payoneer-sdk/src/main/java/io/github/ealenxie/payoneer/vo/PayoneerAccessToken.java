package io.github.ealenxie.payoneer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/31 16:51
 */
@Getter
@Setter
public class PayoneerAccessToken {

    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("expires_in")
    private Integer expiresIn;
    @JsonProperty("consented_on")
    private Integer consentedOn;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("refresh_token_expires_in")
    private Integer refreshTokenExpiresIn;
    @JsonProperty("id_token")
    private String idToken;
    @JsonProperty("error")
    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
}
