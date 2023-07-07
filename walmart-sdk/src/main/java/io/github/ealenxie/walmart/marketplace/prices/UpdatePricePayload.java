package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/7 17:18
 * @version 1.0
 */
@Getter
@Setter
public class UpdatePricePayload {

    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * pricing
     */
    @JsonProperty("pricing")
    private List<Pricing> pricing;
}
