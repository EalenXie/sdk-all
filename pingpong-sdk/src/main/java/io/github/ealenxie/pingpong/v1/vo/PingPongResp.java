package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 10:35
 */
@Getter
@Setter
public class PingPongResp<T> {

    private static final String PING_PONG_SUCCESS_CODE = "0000";

    @JsonProperty("apiName")
    private String apiName;
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;

    public boolean isOk() {
        return PING_PONG_SUCCESS_CODE.equals(code);
    }
}
