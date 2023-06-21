package io.github.ealenxie.cne.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/16 11:31
 */
@Getter
@Setter
public class TrackNumberVO {

    /**
     * 状态
     * 大于0：成功
     * 小于等于0：失败
     */
    @JsonProperty("ReturnValue")
    private Integer returnValue;
    /**
     * 错误描述
     */
    @JsonProperty("cMess")
    private String cMess;
    @JsonProperty("Response_Info")
    private TrackingInfoVO responseInfo;
}
