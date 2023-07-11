package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/11/16 11:25
 */
@Getter
@Setter
public class RefreshTokenQueryParams {
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("grant_type")
    private String grantType = "refresh_token";
}
