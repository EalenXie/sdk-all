package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 11:38
 */
@Getter
@Setter
public class AddMessageToDisputePayload {
    /**
     * text
     */
    @JsonProperty("text")
    private String text;
    /**
     * attachment
     */
    @JsonProperty("attachment")
    private IdPayload attachment;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
