package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@NoArgsConstructor
@Data
public class ItemDetail {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
}
