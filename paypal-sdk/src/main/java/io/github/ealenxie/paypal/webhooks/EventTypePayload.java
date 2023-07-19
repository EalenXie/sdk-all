package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/19 16:02
 **/
@Getter
@Setter
public class EventTypePayload {

    /**
     * An array of webhook events.
     */
    @JsonProperty("event_types")
    private List<EventType> eventTypes;
}

