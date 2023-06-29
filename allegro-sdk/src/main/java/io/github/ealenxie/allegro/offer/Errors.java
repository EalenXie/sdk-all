package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@NoArgsConstructor
@Data
public class Errors {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * details
     */
    @JsonProperty("details")
    private String details;
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
    /**
     * path
     */
    @JsonProperty("path")
    private String path;
    /**
     * userMessage
     */
    @JsonProperty("userMessage")
    private String userMessage;
}
