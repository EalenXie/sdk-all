package io.github.ealenxie.fop.track.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 16:03
 */
@Getter
@Setter
public class Tracking {
    /**
     * 轨迹代码
     */
    @JsonProperty("businessLinkCode")
    private String businessLinkCode;

    /**
     * 轨迹发生时间
     */
    @JsonProperty("occurDatetime")
    private String occurDatetime;

    /**
     * 轨迹发生地
     */
    @JsonProperty("occurLocation")
    private String occurLocation;

    /**
     * 轨迹描述
     */
    @JsonProperty("trackingContent")
    private String trackingContent;
}
