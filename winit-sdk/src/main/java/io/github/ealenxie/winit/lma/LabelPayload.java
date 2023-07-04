package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:05
 * @version 1.0
 */
@Getter
@Setter
public class LabelPayload {
    /**
     * 包裹运单号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * 面单文件
     * Base64字符串
     */
    @JsonProperty("label")
    private String label;
    /**
     * 面单文件的格式
     * pdf\png\jpg\jpeg
     */
    @JsonProperty("formatType")
    private String formatType;
    /**
     * 包裹编号
     */
    @JsonProperty("packageNum")
    private String packageNum;
}
