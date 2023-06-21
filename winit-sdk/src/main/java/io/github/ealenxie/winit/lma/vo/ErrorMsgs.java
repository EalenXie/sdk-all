package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:35
 * @version 1.0
 */
@Getter
@Setter
public class ErrorMsgs {
    /**
     * Winit订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 错误码（为空表示成功，否则显示相应错误码）
     */
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * 错误信息（为空表示成功，否则显示相应错误信息）
     */
    @JsonProperty("errorMsg")
    private String errorMsg;
}
