package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/23 13:33
 */
@Getter
@Setter
public class WishToken {

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("scopes")
    private List<String> scopes;
    /**
     * 该令牌所链接的商家的ID
     */
    @JsonProperty("merchant_id")
    private String merchantId;
    @JsonProperty("expiry_time")
    private String expiryTime;
    @JsonProperty("refresh_token")
    private String refreshToken;
}
