package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:45
 */
@NoArgsConstructor
@Data
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
