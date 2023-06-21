package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by EalenXie on 2022/11/2 11:14
 */

@Getter
@Setter
public class Response<T> {

    @JsonProperty("code")
    private String code;
    @JsonProperty("ask")
    private String ask;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("service")
    private String service;
    @JsonProperty("responseTime")
    private String responseTime;

    public boolean isOk() {
        return "200".equals(code);
    }
}
