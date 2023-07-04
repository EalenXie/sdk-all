package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@NoArgsConstructor
@Data
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
