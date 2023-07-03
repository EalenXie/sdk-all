package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 10:24
 */
@Getter
@Setter
public class ProductSetResponse {
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Quantity quantity;
    /**
     * product
     */
    @JsonProperty("product")
    private ProductResponse product;
}
