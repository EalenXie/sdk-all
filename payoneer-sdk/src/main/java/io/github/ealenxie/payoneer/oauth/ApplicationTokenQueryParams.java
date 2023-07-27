package io.github.ealenxie.payoneer.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/27 16:50
 */
@Getter
@Setter
public class ApplicationTokenQueryParams {
    @JsonProperty("grant_type")
    private String grantType = "client_credentials";
    @JsonProperty("scope")
    private String scope = "read write openid";
}
