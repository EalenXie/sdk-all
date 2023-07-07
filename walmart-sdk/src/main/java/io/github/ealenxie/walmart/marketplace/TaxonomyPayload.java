package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:52
 * @version 1.0
 */
@Getter
@Setter
public class TaxonomyPayload {
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * subcategory
     */
    @JsonProperty("subcategory")
    private List<Subcategory> subcategory;
}
