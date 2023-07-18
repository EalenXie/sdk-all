package io.github.ealenxie.paypal.catalogproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:13
 */
@NoArgsConstructor
@Data
public class ProductListResponse {

    /**
     * totalItems
     */
    @JsonProperty("total_items")
    private Integer totalItems;
    /**
     * totalPages
     */
    @JsonProperty("total_pages")
    private Integer totalPages;
    /**
     * products
     */
    @JsonProperty("products")
    private List<Product> products;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
