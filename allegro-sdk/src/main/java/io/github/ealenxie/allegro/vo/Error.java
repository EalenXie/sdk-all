package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/28 9:40
 */
@Getter
@Setter
public class Error {
    @JsonProperty("code")
    private String code;
    @JsonProperty("details")
    private String details;
    @JsonProperty("message")
    private String message;
    @JsonProperty("path")
    private String path;
    @JsonProperty("userMessage")
    private String userMessage;
}
