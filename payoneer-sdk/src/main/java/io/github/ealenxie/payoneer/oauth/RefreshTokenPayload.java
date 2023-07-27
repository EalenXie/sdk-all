package io.github.ealenxie.payoneer.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/27 17:29
 */
@Getter
@Setter
@NoArgsConstructor
public class RefreshTokenPayload {
    @JsonProperty("grant_type")
    private String grantType = "refresh_token";
    @JsonProperty("refresh_token")
    private String refreshToken;

    public RefreshTokenPayload(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
