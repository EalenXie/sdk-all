package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@Getter
@Setter
public class UrlPayload {
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
}
