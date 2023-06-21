package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/10 13:48
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthResult {
    private Long aliId;
    private String accessToken;
    private String resourceOwnerId;
    private String memberId;
    private String clientId;
    private Long accessTokenTimeout;
}
