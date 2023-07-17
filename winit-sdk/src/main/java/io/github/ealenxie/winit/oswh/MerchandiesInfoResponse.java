package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 10:24
 */
@NoArgsConstructor
@Data
public class MerchandiesInfoResponse {

    /**
     * merchandiesInfo
     */
    @JsonProperty("merchandiesInfo")
    private MerchandiesInfo merchandiesInfo;
}
