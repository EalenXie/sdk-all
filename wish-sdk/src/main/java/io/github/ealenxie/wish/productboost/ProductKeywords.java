package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 14:31
 */
@Getter
@Setter
public class ProductKeywords {
    /**
     * keywords
     */
    @JsonProperty("keywords")
    private List<String> keywords;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
}
