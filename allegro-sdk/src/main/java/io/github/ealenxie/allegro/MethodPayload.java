package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 10:13
 */
@Getter
@Setter
public class MethodPayload {
    /**
     * method
     */
    @JsonProperty("method")
    private String method;
}
