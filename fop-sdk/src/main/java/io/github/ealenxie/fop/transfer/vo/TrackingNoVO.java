package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:53
 */
@Getter
@Setter
public class TrackingNoVO {

    /**
     * 4PX跟踪号
     */
    @JsonProperty("4pxTrackingNo")
    private String fpxTrackingNo;
}
