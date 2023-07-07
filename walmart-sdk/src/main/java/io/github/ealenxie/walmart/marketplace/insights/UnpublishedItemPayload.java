package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:18
 */
@Getter
@Setter
public class UnpublishedItemPayload {
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * marketPrice
     */
    @JsonProperty("marketPrice")
    private Money marketPrice;
    /**
     * offerStartDate
     */
    @JsonProperty("offerStartDate")
    private String offerStartDate;
    /**
     * marketTrending
     */
    @JsonProperty("marketTrending")
    private String marketTrending;
    /**
     * lifecycleStatus
     */
    @JsonProperty("lifecycleStatus")
    private String lifecycleStatus;
    /**
     * unpublishReasons
     */
    @JsonProperty("unpublishReasons")
    private String unpublishReasons;
    /**
     * conversionRate
     */
    @JsonProperty("conversionRate")
    private Integer conversionRate;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * gmvAmount
     */
    @JsonProperty("gmvAmount")
    private Money gmvAmount;
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * customerRating
     */
    @JsonProperty("customerRating")
    private String customerRating;
    /**
     * pageViews
     */
    @JsonProperty("pageViews")
    private Integer pageViews;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * unpublishedDate
     */
    @JsonProperty("unpublishedDate")
    private String unpublishedDate;
    /**
     * brand
     */
    @JsonProperty("brand")
    private String brand;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * productType
     */
    @JsonProperty("productType")
    private String productType;
    /**
     * offerEndDate
     */
    @JsonProperty("offerEndDate")
    private String offerEndDate;
    /**
     * publishStatus
     */
    @JsonProperty("publishStatus")
    private String publishStatus;
}
