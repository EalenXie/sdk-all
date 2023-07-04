package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 16:44
 * @version 1.0
 */
@Getter
@Setter
public class CategoryIdQueryParams {
    /**
     * categoryId
     */
    @JsonProperty("category.id")
    private String categoryId;
}
