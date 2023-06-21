package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseCode<T> {

    @JsonProperty("message")
    private String message;
    @JsonProperty("code")
    private Integer code;
    private T data;
}
