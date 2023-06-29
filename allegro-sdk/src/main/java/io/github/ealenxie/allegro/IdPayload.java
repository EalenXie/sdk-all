package io.github.ealenxie.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:08
 */
@Getter
@Setter
public class IdPayload {
    @JsonProperty("id")
    private String id;
}
