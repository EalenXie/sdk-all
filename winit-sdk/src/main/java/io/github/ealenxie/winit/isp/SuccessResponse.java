package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:11
 */
@Getter
@Setter
public class SuccessResponse {

    /**
     * success
     */
    @JsonProperty("success")
    private Boolean success;
}
