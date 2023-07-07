package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 16:54
 */
@NoArgsConstructor
@Data
public class SubscriptionPayload {
    /**
     * events
     */
    @JsonProperty("events")
    private List<Events> events;
}
