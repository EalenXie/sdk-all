package io.github.ealenxie.track.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 16:03
 */
@Getter
@Setter
public class Tracking {
    @JsonProperty("businessLinkCode")
    private String businessLinkCode;
    @JsonProperty("occurDatetime")
    private String occurDatetime;
    @JsonProperty("occurLocation")
    private String occurLocation;
    @JsonProperty("trackingContent")
    private String trackingContent;
}
