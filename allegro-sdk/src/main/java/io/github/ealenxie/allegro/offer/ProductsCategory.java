package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@Getter
@Setter
public class ProductsCategory {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * similar
     */
    @JsonProperty("similar")
    private List<IdPayload> similar;
}
