package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:35
 * @version 1.0
 */
@Getter
@Setter
public class ConfirmVO {

    /**
     * 成功个数
     */
    @JsonProperty("successCount")
    private Integer successCount;
    /**
     * 失败个数
     */
    @JsonProperty("failedCount")
    private Integer failedCount;
    /**
     * 错误信息集合
     */
    @JsonProperty("errorMsgs")
    private List<ErrorMsgs> errorMsgs;
}
