package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 11:00
 */
@Getter
@Setter
public class TrackingDetails {
    /**
     * statuses
     */
    @JsonProperty("statuses")
    private List<TrackingDetailsStatus> statuses;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
}
