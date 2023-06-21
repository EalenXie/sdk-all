package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 15:27
 * @version 1.0
 */
@Getter
@Setter
public class PlatformVO {
    /**
     * 平台CODE
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 平台描述
     */
    @JsonProperty("platformDesc")
    private String platformDesc;
}
