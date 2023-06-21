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
    private GoodCangError error;

    public boolean isSuccess() {
        return "Success".equals(ask);
    }
}
