package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 16:46
 */
@NoArgsConstructor
@Data
public class TestNotificationPayload {

    /**
     * eventType
     */
    @JsonProperty("eventType")
    private String eventType;
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
     * authDetails
     */
    @JsonProperty("authDetails")
    private AuthDetails authDetails;
    /**
     * headers
     */
    @JsonProperty("headers")
    private Headers headers;
}
