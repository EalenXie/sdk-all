package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:10
 */
@Getter
@Setter
public class FpxTrackingNoPayload {
    /**
     * 4PX跟踪号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
}
