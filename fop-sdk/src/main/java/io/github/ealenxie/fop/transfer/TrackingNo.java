package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:29
 */
@Getter
@Setter
public class TrackingNo {

    /**
     * fpx单号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
}
