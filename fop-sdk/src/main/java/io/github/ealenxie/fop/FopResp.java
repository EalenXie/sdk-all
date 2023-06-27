package io.github.ealenxie.fop;

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
    /**
     * 1=操作成功, 0=操作失败
     */
    @JsonProperty("result")
    private String result;

    /**
     * 信息描述
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 错误信息
     */
    @JsonProperty("errors")
    private List<Error> errors;

    /**
     * 返回数据体
     */
    @JsonProperty("data")
    private T data;

    public boolean isOk() {
        return "1".equals(result);
    }

}
