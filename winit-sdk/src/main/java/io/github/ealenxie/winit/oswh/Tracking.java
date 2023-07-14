package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:22
 * @version 1.0
 */
@Getter
@Setter
public class Tracking {
    /**
     * date
     */
    @JsonProperty("date")
    private String date;
    /**
     * trackingDesc
     */
    @JsonProperty("trackingDesc")
    private String trackingDesc;
    /**
     * location
     */
    @JsonProperty("location")
    private String location;
    /**
     * trackingCode
     */
    @JsonProperty("trackingCode")
    private String trackingCode;
}
