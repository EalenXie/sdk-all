package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductInfo {
    /**
     * The total number of items that are included in the ASIN.
     */
    @JsonProperty("NumberOfItems")
    private Integer numberOfItems;
}