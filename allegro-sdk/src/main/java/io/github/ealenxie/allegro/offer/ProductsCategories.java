package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@NoArgsConstructor
@Data
public class ProductsCategories {
    /**
     * subcategories
     */
    @JsonProperty("subcategories")
    private List<Subcategories> subcategories;
    /**
     * path
     */
    @JsonProperty("path")
    private List<Subcategories> path;
}
