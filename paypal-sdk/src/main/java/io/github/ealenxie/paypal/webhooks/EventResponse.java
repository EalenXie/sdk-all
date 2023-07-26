package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/20 13:40
 **/
@Getter
@Setter
public class EventResponse {

    /**
     * An array of webhooks events.
     */
    @JsonProperty("events")
    private List<WebhookEvent> events;
    /**
     * The number of items in each range of results.
     * Note that the response might have fewer items than the requested page_size value.
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * An array of request-related HATEOAS links.
     */
    @JsonProperty("links")
    private List<Link> links;

}

