package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:22
 * @version 1.0
 */
@Getter
@Setter
public class Strategy {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * repricerStrategy
     */
    @JsonProperty("repricerStrategy")
    private String repricerStrategy;
    /**
     * minimumSellerAllowedPrice
     */
    @JsonProperty("minimumSellerAllowedPrice")
    private Double minimumSellerAllowedPrice;
    /**
     * maximumSellerAllowedPrice
     */
    @JsonProperty("maximumSellerAllowedPrice")
    private Integer maximumSellerAllowedPrice;
}
