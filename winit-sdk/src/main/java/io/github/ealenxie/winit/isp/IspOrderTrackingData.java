package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:25
 */
@Getter
@Setter
public class IspOrderTrackingData {
    /**
     * 跟踪号/winit订单号
     * 支持多个，逗号隔开
     */
    @JsonProperty("trackingNOs")
    private String trackingNOs;
    /**
     * 语言
     * 1.zh_CN:简体中文
     * 2.zh_TW:繁体中文
     * 3.en_US:英文
     */
    @JsonProperty("language")
    private String language;
}
