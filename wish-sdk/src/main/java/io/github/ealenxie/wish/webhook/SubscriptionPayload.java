package io.github.ealenxie.wish.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:49
 * @version 1.0
 */
@Getter
@Setter
public class SubscriptionPayload {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * endpoint
     */
    @JsonProperty("endpoint")
    private String endpoint;
}
