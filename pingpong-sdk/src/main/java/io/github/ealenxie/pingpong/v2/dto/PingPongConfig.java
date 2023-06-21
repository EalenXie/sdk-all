package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 15:07
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PingPongConfig {
    /**
     * PingPong分配给客户唯一标记
     */
    @JsonProperty("app_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String appId;
    /**
     * PingPong分配给客户唯一标记对应的密钥
     */
    @JsonProperty("app_secret")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String appSecret;
    /**
     *
     */
    @JsonProperty("access_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accessToken;
}
