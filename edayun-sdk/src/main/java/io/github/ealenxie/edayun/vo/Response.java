package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Response<T> {

    @JsonProperty("errors")
    private List<ErrorMessage> errors;
    @JsonProperty("data")
    private T data;
    @JsonProperty("nonceToken")
    private String nonceToken;
    @JsonProperty("errorsToString")
    private String errorsToString;
}
