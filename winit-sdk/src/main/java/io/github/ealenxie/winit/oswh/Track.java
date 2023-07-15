package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/15 13:46
 */
@Getter
@Setter
public class Track {

    /**
     * scanlocation
     */
    @JsonProperty("scanlocation")
    private Object scanlocation;
    /**
     * scandateTime
     */
    @JsonProperty("scandateTime")
    private String scandateTime;
    /**
     * trackingmess
     */
    @JsonProperty("trackingmess")
    private String trackingmess;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
