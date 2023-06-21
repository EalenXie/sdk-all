package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 10 17
 */
@Getter
@Setter
public class SyncProductResp {
    /**
     * 错误码
     */
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * 错误信息
     */
    @JsonProperty("errorMsg")
    private String errorMsg;
    /**
     * 是否成功
     */
    @JsonProperty("success")
    private Boolean success;

}
