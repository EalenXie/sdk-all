package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Filter;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class OffersResponse {

    /**
     * items
     */
    @JsonProperty("items")
    private Items items;
    /**
     * categories
     */
    @JsonProperty("categories")
    private Categories categories;
    /**
     * filters
     */
    @JsonProperty("filters")
    private List<Filter> filters;
    /**
     * searchMeta
     */
    @JsonProperty("searchMeta")
    private SearchMeta searchMeta;
    /**
     * sort
     */
    @JsonProperty("sort")
    private List<Sort> sort;
}
