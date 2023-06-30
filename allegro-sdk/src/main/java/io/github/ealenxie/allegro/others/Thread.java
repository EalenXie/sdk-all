package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Thread extends BaseId {
    /**
     * read
     */
    @JsonProperty("read")
    private Boolean read;
    /**
     * lastMessageDateTime
     */
    @JsonProperty("lastMessageDateTime")
    private String lastMessageDateTime;
    /**
     * interlocutor
     */
    @JsonProperty("interlocutor")
    private Interlocutor interlocutor;
}
