package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 9:53
 */
@Getter
@Setter
public class SkuPayload {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
}
