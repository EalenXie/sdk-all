package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 38
 */
@Getter
@Setter
public class CreateRefundResp {
    /**
     * 错误码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 错误信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 结果
     */
    @JsonProperty("result")
    private CreateRefundResult result;
    /**
     * 是否成功
     */
    @JsonProperty("success")
    private boolean success;
}
