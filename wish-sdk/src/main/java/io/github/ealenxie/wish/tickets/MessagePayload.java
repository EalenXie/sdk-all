package io.github.ealenxie.wish.tickets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 14:13
 * @version 1.0
 */
@Getter
@Setter
public class MessagePayload {
    /**
     * message
     */
    @JsonProperty("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
}
