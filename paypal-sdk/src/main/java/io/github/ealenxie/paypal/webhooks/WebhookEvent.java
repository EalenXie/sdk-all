package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/20 10:54
 **/
@Getter
@Setter
public class WebhookEvent {
    /**
     * The ID of the webhook event notification.
     */
    @JsonProperty("id")
    private String id;
    /**
     * The date and time when the webhook event notification was created, in Internet date and time format.
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * The name of the resource related to the webhook notification event.
     */
    @JsonProperty("resource_type")
    private String resourceType;
    /**
     * The event version in the webhook notification.
     */
    @JsonProperty("event_version")
    private String eventVersion;
    /**
     * The event that triggered the webhook event notification.
     */
    @JsonProperty("event_type")
    private String eventType;
    /**
     * A summary description for the event notification.
     */
    @JsonProperty("summary")
    private String summary;
    /**
     * The resource that triggered the webhook event notification.
     */
    @JsonProperty("resource")
    private Resource resource;

    /**
     * The resource version in the webhook notification.
     */
    @JsonProperty("resource_version")
    private String resourceVersion;

    /**
     * An array of request-related HATEOAS links.
     */
    @JsonProperty("links")
    private List<Link> links;

}

