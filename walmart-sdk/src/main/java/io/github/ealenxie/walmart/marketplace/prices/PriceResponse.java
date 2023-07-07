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
public class PriceResponse {

    /**
     * itemPriceResponse
     */
    @JsonProperty("ItemPriceResponse")
    private ItemPriceResponse itemPriceResponse;
}
