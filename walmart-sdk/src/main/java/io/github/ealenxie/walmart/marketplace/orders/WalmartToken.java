package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/16 15:08
 */
@Getter
@Setter
public class WalmartToken {

    @JsonProperty("access_token")
    private String accessToken;
    /**
     * 令牌类型
     */
    @JsonProperty("token_type")
    private String tokenType;
    /**
     * 过期时间
     */
    @JsonProperty("expires_in")
    private Integer expiresIn;
}
