package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@NoArgsConstructor
@Data
public class Marketplaces {
    /**
     * base
     */
    @JsonProperty("base")
    private IdPayload base;
    /**
     * additional
     */
    @JsonProperty("additional")
    private List<IdPayload> additional;
}
