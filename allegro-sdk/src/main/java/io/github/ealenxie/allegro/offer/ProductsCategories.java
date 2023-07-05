package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@Getter
@Setter
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
