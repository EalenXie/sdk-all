package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:51
 */
@Getter
@Setter
public class Events {
    /**
     * eventType
     */
    @JsonProperty("eventType")
    private String eventType;
    /**
     * subscriptionId
     */
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    /**
     * partnerId
     */
    @JsonProperty("partnerId")
    private String partnerId;
    /**
     * eventVersion
     */
    @JsonProperty("eventVersion")
    private String eventVersion;
    /**
     * resourceName
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * eventUrl
     */
    @JsonProperty("eventUrl")
    private String eventUrl;
    /**
     * headers
     */
    @JsonProperty("headers")
    private Headers headers;
    /**
     * authDetails
     */
    @JsonProperty("authDetails")
    private AuthDetails authDetails;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
