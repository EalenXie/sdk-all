package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:57
 */
@Getter
@Setter
public class IspOrderDisableResponse {
    /**
     * successCount
     */
    @JsonProperty("successCount")
    private Integer successCount;
    /**
     * failedCount
     */
    @JsonProperty("failedCount")
    private Integer failedCount;
}
