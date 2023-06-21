package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 14:45
 * @version 1.0
 */
@Getter
@Setter
public class AuthVO {
    /**
     * 授权
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * 过期时间
     */
    @JsonProperty("expires_in")
    private String expiresIn;
}
