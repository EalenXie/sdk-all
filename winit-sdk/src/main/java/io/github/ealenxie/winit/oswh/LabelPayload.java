package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/25 17:37
 * @version 1.0
 */
@Getter
@Setter
public class LabelPayload {
    /**
     * Base64编码
     */
    @JsonProperty("label")
    private String label;
}
