package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.prices.ItemPriceResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/10 14:24
 * @version 1.0
 */
@Getter
@Setter
public class UpdatePromotionalResponse {

    /**
     * itemPriceResponse
     */
    @JsonProperty("ItemPriceResponse")
    private ItemPriceResponse itemPriceResponse;
}
