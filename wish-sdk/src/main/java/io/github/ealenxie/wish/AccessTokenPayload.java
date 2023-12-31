package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 13:03
 */

@Getter
@Setter
public class AccessTokenPayload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
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
