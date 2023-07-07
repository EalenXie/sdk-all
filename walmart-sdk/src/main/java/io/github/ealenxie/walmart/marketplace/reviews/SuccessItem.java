package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:45
 */
@NoArgsConstructor
@Data
public class SuccessItem {
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * itemDescription
     */
    @JsonProperty("itemDescription")
    private String itemDescription;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
}
