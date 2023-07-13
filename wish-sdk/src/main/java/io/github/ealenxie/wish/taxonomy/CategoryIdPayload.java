package io.github.ealenxie.wish.taxonomy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 14:44
 * @version 1.0
 */
@Getter
@Setter
public class CategoryIdPayload {
    /**
     * categoryId
     */
    @JsonProperty("category_id")
    private String categoryId;
}
