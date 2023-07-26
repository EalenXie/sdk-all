package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/18 14:22
 **/
@Getter
@Setter
public class EventType {

    /**
     * The unique event name.
     */
    @JsonProperty("name")
    private String name;
    /**
     * A human-readable description of the event.
     */
    @JsonProperty("description")
    private String description;
    /**
     * Identifier for the event type example: 1.0/2.0 etc.
     */
    @JsonProperty("resource_versions")
    private List<String> resourceVersions;

    /**
     * The status of a webhook event.
     */
    @JsonProperty("status")
    private String status;
}

