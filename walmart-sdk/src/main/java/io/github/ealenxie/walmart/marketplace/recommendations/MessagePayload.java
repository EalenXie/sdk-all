package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:25
 */
@NoArgsConstructor
@Data
public class MessagePayload {
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
}
