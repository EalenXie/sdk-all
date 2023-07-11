package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 9:46
 */
@Getter
@Setter
public class MessageStatusResponse {
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
