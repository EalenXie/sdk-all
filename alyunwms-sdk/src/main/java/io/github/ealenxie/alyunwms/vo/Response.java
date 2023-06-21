package io.github.ealenxie.alyunwms.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;


/**
 * Created by EalenXie on 2022/11/2 11:14
 */

@Getter
@Setter
public class Response<T> {

    @JsonProperty("ask")
    private String ask;
    @JsonProperty("f_ask")
    private String fAsk;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private T data;
    @JsonProperty("Error")
    private Error error;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("Success", ask);
    }
}
