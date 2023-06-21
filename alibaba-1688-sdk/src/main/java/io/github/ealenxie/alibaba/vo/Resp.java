package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 13:39
 */
@Getter
@Setter
public class Resp<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String success;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;
    /**
     * 错误信息扩展
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String extErrorMessage;
    @JsonProperty("result")
    private T result;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("true", success);
    }

    public String getErrorMessage() {
        return ObjectUtils.isEmpty(errorMessage) ? message : errorMessage;
    }
}
