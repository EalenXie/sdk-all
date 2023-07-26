package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:27
 */
@Getter
@Setter
public class Trace {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * 日期
     */
    @JsonProperty("date")
    private String date;
    /**
     * 地点
     */
    @JsonProperty("location")
    private String location;
    /**
     * 是否最后轨迹
     * Y是 N否
     */
    @JsonProperty("lastEvent")
    private String lastEvent;
    /**
     * 轨迹编码
     */
    @JsonProperty("eventCode")
    private String eventCode;
    /**
     * 轨迹状态
     */
    @JsonProperty("eventStatus")
    private String eventStatus;
    /**
     * 轨迹描述
     */
    @JsonProperty("eventDescription")
    private String eventDescription;
    /**
     * operator
     */
    @JsonProperty("operator")
    private String operator;
    /**
     * trackingType
     */
    @JsonProperty("trackingType")
    private String trackingType;
}
