package io.github.ealenxie.walmart.marketplace.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 16:47
 */
@NoArgsConstructor
@Data
public class MessageResponse {

    /**
     * message
     */
    @JsonProperty("message")
    private String message;
}
