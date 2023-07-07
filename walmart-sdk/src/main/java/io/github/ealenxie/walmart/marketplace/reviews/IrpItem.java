package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:58
 */
@NoArgsConstructor
@Data
public class IrpItem {
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * itemName
     */
    @JsonProperty("itemName")
    private String itemName;
    /**
     * sales
     */
    @JsonProperty("sales")
    private Integer sales;
    /**
     * currentReviews
     */
    @JsonProperty("currentReviews")
    private Integer currentReviews;
    /**
     * impressions
     */
    @JsonProperty("impressions")
    private Integer impressions;
    /**
     * currentPageViews
     */
    @JsonProperty("currentPageViews")
    private Integer currentPageViews;
    /**
     * reviewsCollected
     */
    @JsonProperty("reviewsCollected")
    private Integer reviewsCollected;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * itemStatus
     */
    @JsonProperty("itemStatus")
    private String itemStatus;
    /**
     * itemPriority
     */
    @JsonProperty("itemPriority")
    private Integer itemPriority;
}
