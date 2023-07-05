package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 13:13
 */
@NoArgsConstructor
@Data
public class ProductsGroup {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * text
     */
    @JsonProperty("text")
    private String text;
}
