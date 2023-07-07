package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class ItemListingDetailPayload {
    /**
     * qualityScoreData
     */
    @JsonProperty("qualityScoreData")
    private QualityScoreData qualityScoreData;
    /**
     * productId
     */
    @JsonProperty("productId")
    private String productId;
    /**
     * scoreDetails
     */
    @JsonProperty("scoreDetails")
    private ScoreDetails scoreDetails;
    /**
     * wfsEnabled
     */
    @JsonProperty("wfsEnabled")
    private Integer wfsEnabled;
    /**
     * priority
     */
    @JsonProperty("priority")
    private String priority;
    /**
     * categoryName
     */
    @JsonProperty("categoryName")
    private String categoryName;
    /**
     * updatedTimestamp
     */
    @JsonProperty("updatedTimestamp")
    private String updatedTimestamp;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * stats
     */
    @JsonProperty("stats")
    private Stats stats;
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
     * trends
     */
    @JsonProperty("trends")
    private List<Trend> trends;
}
