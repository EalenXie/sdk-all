package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * @author lanzhi
 * Created on 2023/5/10 14:51
 **/
@Getter
@Setter
public class ResponseV1<T> {
    /**
     * 结果集
     */
    private T result;
    /**
     * 返回码
     */
    private Integer errcode;
    /**
     * 调用失败时返回的错误信息
     */
    private String errmsg;
    /**
     * 请求ID
     */
    @JsonProperty("request_id")
    private String requestId;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals(0, errcode);
    }
}

