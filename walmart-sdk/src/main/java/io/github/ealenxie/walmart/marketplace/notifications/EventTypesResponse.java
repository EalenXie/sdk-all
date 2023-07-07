package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 17:04
 */
@NoArgsConstructor
@Data
public class EventTypesResponse {

    /**
     * events
     */
    @JsonProperty("events")
    private List<EventTypeResponse> events;
}
