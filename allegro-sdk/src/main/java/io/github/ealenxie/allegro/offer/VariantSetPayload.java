package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 10:58
 */
@NoArgsConstructor
@Data
public class VariantSetPayload {

    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * offers
     */
    @JsonProperty("offers")
    private List<IdPayload> offers;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<IdPayload> parameters;
}
