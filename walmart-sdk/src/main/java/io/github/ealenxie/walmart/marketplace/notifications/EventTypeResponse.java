package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 17:04
 */
@NoArgsConstructor
@Data
public class EventTypeResponse {
    /**
     * resourceName
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * eventType
     */
    @JsonProperty("eventType")
    private String eventType;
    /**
     * eventVersion
     */
    @JsonProperty("eventVersion")
    private String eventVersion;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
}
