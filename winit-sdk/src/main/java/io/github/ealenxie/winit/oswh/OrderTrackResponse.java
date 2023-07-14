package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:22
 * @version 1.0
 */
@Getter
@Setter
public class OrderTrackResponse {

    /**
     * trackingList
     */
    @JsonProperty("trackingList")
    private List<Tracking> trackingList;
}
