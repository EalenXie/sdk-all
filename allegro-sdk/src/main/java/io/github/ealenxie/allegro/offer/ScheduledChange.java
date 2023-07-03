package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 15:36
 */
@NoArgsConstructor
@Data
public class ScheduledChange {


    /**
     * scheduledAt
     */
    @JsonProperty("scheduledAt")
    private String scheduledAt;
    /**
     * scheduledFor
     */
    @JsonProperty("scheduledFor")
    private String scheduledFor;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
    /**
     * parameter
     */
    @JsonProperty("parameter")
    private IdPayload parameter;
}
