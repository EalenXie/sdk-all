package io.github.ealenxie.wish.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:44
 * @version 1.0
 */
@Getter
@Setter
public class SubscriptionResponse {

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
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * topicId
     */
    @JsonProperty("topic_id")
    private String topicId;
}
