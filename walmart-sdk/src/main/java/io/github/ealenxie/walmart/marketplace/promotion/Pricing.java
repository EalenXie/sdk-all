package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.MoneyValue;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/10 14:57
 * @version 1.0
 */
@Getter
@Setter
public class Pricing {
    /**
     * currentPrice
     */
    @JsonProperty("currentPrice")
    private MoneyValue currentPrice;
    /**
     * currentPriceType
     */
    @JsonProperty("currentPriceType")
    private String currentPriceType;
    /**
     * comparisonPrice
     */
    @JsonProperty("comparisonPrice")
    private MoneyValue comparisonPrice;
    /**
     * comparisonPriceType
     */
    @JsonProperty("comparisonPriceType")
    private String comparisonPriceType;
    /**
     * savingsAmount
     */
    @JsonProperty("savingsAmount")
    private Integer savingsAmount;
    /**
     * savingsPercent
     */
    @JsonProperty("savingsPercent")
    private Integer savingsPercent;
    /**
     * priceDisplayCodes
     */
    @JsonProperty("priceDisplayCodes")
    private PriceDisplayCodes priceDisplayCodes;
    /**
     * effectiveDate
     */
    @JsonProperty("effectiveDate")
    private Long effectiveDate;
    /**
     * expirationDate
     */
    @JsonProperty("expirationDate")
    private Long expirationDate;
    /**
     * promoId
     */
    @JsonProperty("promoId")
    private String promoId;
}
