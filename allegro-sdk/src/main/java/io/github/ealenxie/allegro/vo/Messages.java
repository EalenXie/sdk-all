package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/22 17:04
 */
@Getter
@Setter
public class Messages {
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
