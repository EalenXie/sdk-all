package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:58
 */
@Getter
@Setter
public class DeleteSubscriptionResponse {

    /**
     * subscriptionId
     */
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
}
