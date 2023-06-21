package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

/**
 * @author create by sch  2023/6/8 16:07
 * @version 1.0
 */
@Getter
@Setter
public class PingPongResp<T> {
    private static final List<String> PING_PONG_SUCCESS_CODE = Arrays.asList("0000", "0");

    @JsonProperty("apiName")
    private String apiName;
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;

    public boolean isOk() {
        return PING_PONG_SUCCESS_CODE.contains(code);
    }
}
