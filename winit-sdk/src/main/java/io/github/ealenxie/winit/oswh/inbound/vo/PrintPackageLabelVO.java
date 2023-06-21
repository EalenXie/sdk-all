package io.github.ealenxie.winit.oswh.inbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/25 17:37
 * @version 1.0
 */
@Getter
@Setter
public class PrintPackageLabelVO {
    /**
     * Base64编码
     */
    @JsonProperty("label")
    private String label;
}
