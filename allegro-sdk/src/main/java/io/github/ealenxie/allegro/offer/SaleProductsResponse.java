package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Filter;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@Getter
@Setter
public class SaleProductsResponse {


    /**
     * products
     */
    @JsonProperty("products")
    private List<Products> products;
    /**
     * categories
     */
    @JsonProperty("categories")
    private ProductsCategories categories;
    /**
     * filters
     */
    @JsonProperty("filters")
    private List<Filter> filters;
    /**
     * nextPage
     */
    @JsonProperty("nextPage")
    private Subcategories nextPage;
}
