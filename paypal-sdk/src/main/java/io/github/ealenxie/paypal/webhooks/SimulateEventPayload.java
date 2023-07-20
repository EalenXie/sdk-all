package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/20 14:53
 **/
@Getter
@Setter
public class SimulateEventPayload {
    /**
     * The ID of the webhook. If omitted, the URL is required.
     */
    @JsonProperty("webhook_id")
    private String webhookId;
    /**
     * The URL for the webhook endpoint. If omitted, the webhook ID is required.
     */
    @JsonProperty("url")
    private String url;
    /**
     * The event name. Specify one of the subscribed events. For each request, provide only one event.
     */
    @JsonProperty("event_type")
    private String eventType;
    /**
     * The identifier for event type ex: 1.0/2.0 etc.
     */
    @JsonProperty("resource_version")
    private String resourceVersion;
}

