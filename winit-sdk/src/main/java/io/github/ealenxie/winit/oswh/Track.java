package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:46
 */
@NoArgsConstructor
@Data
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
