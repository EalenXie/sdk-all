package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 10:24
 */
@Getter
@Setter
public class MerchandiesInfoResponse {

    /**
     * merchandiesInfo
     */
    @JsonProperty("merchandiesInfo")
    private MerchandiesInfo merchandiesInfo;
}
