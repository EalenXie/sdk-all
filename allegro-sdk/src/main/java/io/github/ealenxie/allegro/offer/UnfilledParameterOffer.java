package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 11:13
 */
@NoArgsConstructor
@Data
public class UnfilledParameterOffer {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<IdPayload> parameters;
    /**
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
}
