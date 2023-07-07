package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@Getter
@Setter
public class OfferPrice {
    /**
     * score
     */
    @JsonProperty("score")
    private Object score;
    /**
     * walmartShipping
     */
    @JsonProperty("walmartShipping")
    private Integer walmartShipping;
    /**
     * additionalDes
     */
    @JsonProperty("additionalDes")
    private Object additionalDes;
    /**
     * competitorShipping
     */
    @JsonProperty("competitorShipping")
    private Integer competitorShipping;
    /**
     * competitorPrice
     */
    @JsonProperty("competitorPrice")
    private Money competitorPrice;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * issueTitle
     */
    @JsonProperty("issueTitle")
    private String issueTitle;
    /**
     * asin
     */
    @JsonProperty("asin")
    private String asin;
}
