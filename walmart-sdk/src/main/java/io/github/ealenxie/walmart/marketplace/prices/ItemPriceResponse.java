package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:19
 * @version 1.0
 */
@Getter
@Setter
public class ItemPriceResponse {
    /**
     * mart
     */
    @JsonProperty("mart")
    private String mart;
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
}
