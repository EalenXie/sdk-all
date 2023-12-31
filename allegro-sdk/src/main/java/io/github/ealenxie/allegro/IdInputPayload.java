package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/28 15:38
 */
@Getter
@Setter
public class IdInputPayload<T> extends InputPayload<T> {
    @JsonProperty("id")
    private String id;
}
