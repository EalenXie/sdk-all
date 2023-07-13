package io.github.ealenxie.wish.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:55
 * @version 1.0
 */
@Getter
@Setter
public class TopicPayload {

    /**
     * topicName
     */
    @JsonProperty("topic_name")
    private String topicName;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * apiVersion
     */
    @JsonProperty("api_version")
    private String apiVersion;
}
