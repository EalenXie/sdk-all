package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:09
 */
@Getter
@Setter
public class ExceptionHandle {
    /**
     * 异常处理方案编码:
     * <p>
     * TRANSPORT-->全部转运;
     * <p>
     * RETURN-->全部退运;
     * <p>
     * ABANDON-->全部弃件;
     * <p>
     * TRANS_RETURN-->部分转运部分退件;
     * <p>
     * TRANS_ABANDON-->部分转运,部分弃件
     */
    @JsonProperty("exceptionHandleCode")
    private String exceptionHandleCode;

    /**
     * 异常描述
     */
    @JsonProperty("exceptionHandleDesc")
    private String exceptionHandleDesc;
}
