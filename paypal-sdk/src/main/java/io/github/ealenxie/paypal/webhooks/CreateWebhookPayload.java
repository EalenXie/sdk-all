package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/18 14:16
 **/
@Getter
@Setter
public class CreateWebhookPayload {
    
    /**
     * The URL that is configured to listen on localhost for incoming POST
     * notification messages that contain event information.
     */
    @JsonProperty("url")
    private String url;

    /**
     * An array of events to which to subscribe your webhook.
     * To subscribe to all events, including events as they are added,
     * specify the asterisk wild card. To replace the event_types array,
     * specify the asterisk wild card. To list all supported events, list available events.
     */
    @JsonProperty("event_types")
    private List<EventType> eventTypes;
}

