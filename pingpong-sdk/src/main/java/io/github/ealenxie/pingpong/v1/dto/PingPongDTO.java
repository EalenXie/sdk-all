package io.github.ealenxie.pingpong.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 11:28
 */
@Getter
@Setter
public abstract class PingPongDTO {
    /**
     * PingPong分配给客户唯一标记
     */
    @JsonProperty("app_id")
    private String appId;
    /**
     * PingPong分配给客户唯一标记对应的密钥
     */
    @JsonProperty("app_secret")
    private String appSecret;

    protected PingPongDTO() {
    }

    protected PingPongDTO(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }
}
