package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/10 14:19
 * @version 1.0
 */
@Getter
@Setter
public class PromotionalPricing {
    /**
     * currentPrice
     */
    @JsonProperty("currentPrice")
    private Money currentPrice;
    /**
     * currentPriceType
     */
    @JsonProperty("currentPriceType")
    private String currentPriceType;
    /**
     * comparisonPriceType
     */
    @JsonProperty("comparisonPriceType")
    private String comparisonPriceType;
    /**
     * comparisonPrice
     */
    @JsonProperty("comparisonPrice")
    private Money comparisonPrice;
    /**
     * priceDisplayCodes
     */
    @JsonProperty("priceDisplayCodes")
    private String priceDisplayCodes;
    /**
     * effectiveDate
     */
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    /**
     * expirationDate
     */
    @JsonProperty("expirationDate")
    private String expirationDate;
    /**
     * processMode
     */
    @JsonProperty("processMode")
    private String processMode;
}
