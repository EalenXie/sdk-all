package io.github.ealenxie.payoneer.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/30 12:27
 */
@Getter
@Setter
public class RevokeToken {

    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("token_type_hint")
    private String tokenTypeHint;
    @JsonProperty("token")
    private String token;
}
