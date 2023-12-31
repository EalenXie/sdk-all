package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/3 12:47
 */
@Getter
@Setter
public class Message {
    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("attachment")
    private Attachment attachment;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("createdAt")
    private String createdAt;
}
