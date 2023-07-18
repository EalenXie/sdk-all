package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@NoArgsConstructor
@Data
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
