package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 13:12
 */
@Getter
@Setter
public class FeedbackResp {
    /**
     * 错误描述
     */
    private String errorInfo;
    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 是否成功
     */
    private Boolean success;
}
