package io.github.ealenxie.wish.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 13:03
 */

@Getter
@Setter
public class AccessTokenQueryParams {

    @JsonProperty("code")
    private String code;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("redirect_uri")
    private String redirectUri;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("grant_type")
    private String grantType = "authorization_code";
}
