package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/28 15:38
 */
@Getter
@Setter
public class InputPayload<T> {

    @JsonProperty("input")
    private T input;
}
