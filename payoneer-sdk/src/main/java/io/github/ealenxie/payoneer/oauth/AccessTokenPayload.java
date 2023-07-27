package io.github.ealenxie.payoneer.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/27 17:18
 */
@Getter
@Setter
public class AccessTokenPayload {
    @JsonProperty("grant_type")
    private String grantType = "authorization_code";
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("code")
    private String code;
    @JsonProperty("redirect_uri")
    private String redirectUri;

}
