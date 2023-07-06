package io.github.ealenxie.paypal.tracking;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/19 11:23
 */
@Getter
@Setter
public class TrackersPayload {

    /**
     * trackers
     */
    @JsonProperty("trackers")
    private List<TrackerPayload> trackers;
}
