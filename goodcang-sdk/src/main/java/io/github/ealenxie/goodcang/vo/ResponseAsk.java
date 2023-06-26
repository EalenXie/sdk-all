package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/9 12:30
 */
@Getter
@Setter
public class ResponseAsk<T> {
    @JsonProperty("ask")
    private String ask;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;
    @JsonProperty("Error")
    private Error error;
    @JsonProperty("code")
    private Integer code;

    public boolean isSuccess() {
        return "Success".equals(ask) || 1 == code;
    }
}
