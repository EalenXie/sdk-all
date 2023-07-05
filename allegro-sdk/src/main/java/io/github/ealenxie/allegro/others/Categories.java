package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.offer.Subcategories;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Categories {
    /**
     * subcategories
     */
    @JsonProperty("subcategories")
    private List<Subcategories> subcategories;
    /**
     * path
     */
    @JsonProperty("path")
    private List<Regular> path;
}
