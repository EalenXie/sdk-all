package io.github.ealenxie.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:53
 */
@Getter
@Setter
public class TrackingNoVO {

    @JsonProperty("4pxTrackingNo")
    private String fpxTrackingNo;
}
