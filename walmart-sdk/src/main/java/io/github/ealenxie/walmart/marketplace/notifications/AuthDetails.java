package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:46
 */
@Getter
@Setter
public class AuthDetails {
    /**
     * authMethod
     */
    @JsonProperty("authMethod")
    private String authMethod;
    /**
     * userName
     */
    @JsonProperty("userName")
    private String userName;
    /**
     * password
     */
    @JsonProperty("password")
    private String password;
    /**
     * authHeaderName
     */
    @JsonProperty("authHeaderName")
    private String authHeaderName;
}
