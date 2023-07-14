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
     * trackingNOs
     */
    @JsonProperty("trackingNOs")
    private String trackingNOs;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
}
