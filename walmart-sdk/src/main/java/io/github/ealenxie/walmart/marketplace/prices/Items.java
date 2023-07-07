package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:09
 * @version 1.0
 */
@Getter
@Setter
public class Items {
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * skuId
     */
    @JsonProperty("skuId")
    private String skuId;
    /**
     * sellerPrice
     */
    @JsonProperty("sellerPrice")
    private Integer sellerPrice;
    /**
     * floorPrice
     */
    @JsonProperty("floorPrice")
    private Integer floorPrice;
    /**
     * incentiveLimit
     */
    @JsonProperty("incentiveLimit")
    private Integer incentiveLimit;
    /**
     * incentiveStartDate
     */
    @JsonProperty("incentiveStartDate")
    private String incentiveStartDate;
    /**
     * incentiveEndDate
     */
    @JsonProperty("incentiveEndDate")
    private String incentiveEndDate;
    /**
     * shippingPrice
     */
    @JsonProperty("shippingPrice")
    private Integer shippingPrice;
    /**
     * competitivePrice
     */
    @JsonProperty("competitivePrice")
    private Integer competitivePrice;
    /**
     * competitorShippingPrice
     */
    @JsonProperty("competitorShippingPrice")
    private Integer competitorShippingPrice;
    /**
     * competitorUrl
     */
    @JsonProperty("competitorUrl")
    private String competitorUrl;
}
