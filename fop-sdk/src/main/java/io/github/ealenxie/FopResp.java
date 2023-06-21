package io.github.ealenxie;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * fop返回的数据
 */
@Getter
@Setter
public class FopResp<T> {

    @JsonProperty("result")
    private String result;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("errors")
    private List<Error> errors;
    @JsonProperty("data")
    private T data;

    public boolean isOk() {
        return "1".equals(result);
    }

}
