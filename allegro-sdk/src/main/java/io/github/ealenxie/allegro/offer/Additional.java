package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 10:05
 */
@Getter
@Setter
public class Additional {
    /**
     * add
     */
    @JsonProperty("add")
    private List<IdPayload> add;
    /**
     * remove
     */
    @JsonProperty("remove")
    private List<IdPayload> remove;
}
