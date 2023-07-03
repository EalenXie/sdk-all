package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 10:24
 */
@NoArgsConstructor
@Data
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
