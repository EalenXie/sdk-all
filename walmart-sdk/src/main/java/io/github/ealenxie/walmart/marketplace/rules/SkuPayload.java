package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 9:53
 */
@NoArgsConstructor
@Data
public class SkuPayload {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
}
