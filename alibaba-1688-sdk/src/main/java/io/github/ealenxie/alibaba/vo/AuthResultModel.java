package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 28
 */
@Getter
@Setter
public class AuthResultModel {
    /**
     * 错误码
     */
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * 错误信息
     */
    @JsonProperty("errorMessage")
    private String errorMessage;
    /**
     * 返回结果
     */
    @JsonProperty("returnValue")
    private Map<String, AuthResult> returnValue;
    /**
     * 是否成功
     */
    @JsonProperty("success")
    private boolean success;
}
