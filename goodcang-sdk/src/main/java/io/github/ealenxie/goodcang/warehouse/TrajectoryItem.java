package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 14:15
 */
@Getter
@Setter
public class TrajectoryItem {
    /**
     * utc 时间 零时区
     */
    @JsonProperty("utc_time")
    private String utcTime;
    /**
     * 北京时间
     */
    @JsonProperty("date_time")
    private String dateTime;
    /**
     * 物流详细信息
     */
    @JsonProperty("info")
    private String info;
    /**
     * 站点信息
     */
    @JsonProperty("location")
    private String location;
    /**
     * 轨迹代码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 轨迹结构化详情
     */
    @JsonProperty("code_info")
    private String codeInfo;
}
