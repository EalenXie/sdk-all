package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/15 13:45
 */
@Getter
@Setter
public class TrackQueryData {


    /**
     * outboundNum
     */
    @JsonProperty("outboundNum")
    private String outboundNum;
    /**
     * warehouseID
     */
    @JsonProperty("warehouseID")
    private String warehouseID;

    @JsonProperty("trackingNum")
    private String trackingNum;
}
