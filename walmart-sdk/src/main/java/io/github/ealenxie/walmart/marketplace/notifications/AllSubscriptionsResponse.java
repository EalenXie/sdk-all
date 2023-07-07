package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 16:51
 */
@Getter
@Setter
public class AllSubscriptionsResponse {


    /**
     * events
     */
    @JsonProperty("events")
    private List<Events> events;
}
