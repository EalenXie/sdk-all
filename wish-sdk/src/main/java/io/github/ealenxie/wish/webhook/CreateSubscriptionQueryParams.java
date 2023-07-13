package io.github.ealenxie.wish.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:41
 * @version 1.0
 */
@Getter
@Setter
public class CreateSubscriptionQueryParams {

    /**
     * endpoint
     */
    @JsonProperty("endpoint")
    private String endpoint;
    /**
     * topicId
     */
    @JsonProperty("topic_id")
    private String topicId;
}
