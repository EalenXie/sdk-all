package io.github.ealenxie.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:29
 */
@Getter
@Setter
public class TrackingNo {


    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
}
