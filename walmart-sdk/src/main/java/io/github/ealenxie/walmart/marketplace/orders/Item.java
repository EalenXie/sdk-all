package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@NoArgsConstructor
@Data
public class Item {
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
}
