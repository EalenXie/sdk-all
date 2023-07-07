package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 10:38
 */
@Getter
@Setter
public class BoxItem {
    /**
     * lineNumber
     */
    @JsonProperty("lineNumber")
    private String lineNumber;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
