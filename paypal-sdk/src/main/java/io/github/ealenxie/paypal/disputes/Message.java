package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@Getter
@Setter
public class Message {
    /**
     * postedBy
     */
    @JsonProperty("posted_by")
    private String postedBy;
    /**
     * timePosted
     */
    @JsonProperty("time_posted")
    private String timePosted;
    /**
     * content
     */
    @JsonProperty("content")
    private String content;
    /**
     * documents
     */
    @JsonProperty("documents")
    private List<Document> documents;
}
