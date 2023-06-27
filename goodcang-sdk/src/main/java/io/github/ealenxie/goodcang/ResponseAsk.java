package io.github.ealenxie.goodcang;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/9 12:30
 */
@Getter
@Setter
public class ResponseAsk<T> {
    /**
     * v1
     */
    @JsonProperty("ask")
    private String ask;
    /**
     * v2
     */
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;
    @JsonProperty("Error")
    private Error error;


    public boolean isSuccess() {
        return "Success".equals(ask) || 1 == code;
    }
}
