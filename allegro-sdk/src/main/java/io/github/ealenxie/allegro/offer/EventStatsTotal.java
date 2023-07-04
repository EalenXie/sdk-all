package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 17:12
 * @version 1.0
 */
@Getter
@Setter
public class EventStatsTotal {
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * eventType
     */
    @JsonProperty("eventType")
    private String eventType;
}
