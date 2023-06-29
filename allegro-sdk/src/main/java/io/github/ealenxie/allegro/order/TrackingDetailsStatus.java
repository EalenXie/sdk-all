package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 11:00
 */
@Getter
@Setter
public class TrackingDetailsStatus {
    /**
     * occurredAt
     */
    @JsonProperty("occurredAt")
    private String occurredAt;
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
}
