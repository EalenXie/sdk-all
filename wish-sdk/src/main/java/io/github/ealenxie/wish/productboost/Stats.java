package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 15:26
 */
@NoArgsConstructor
@Data
public class Stats {
    /**
     * pbSales
     */
    @JsonProperty("pb_sales")
    private Integer pbSales;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * spend
     */
    @JsonProperty("spend")
    private Money spend;
    /**
     * pbImpressions
     */
    @JsonProperty("pb_impressions")
    private Integer pbImpressions;
    /**
     * sales
     */
    @JsonProperty("sales")
    private Integer sales;
    /**
     * totalClicks
     */
    @JsonProperty("total_clicks")
    private Integer totalClicks;
    /**
     * productName
     */
    @JsonProperty("product_name")
    private String productName;
    /**
     * pbClicks
     */
    @JsonProperty("pb_clicks")
    private Integer pbClicks;
    /**
     * impressions
     */
    @JsonProperty("impressions")
    private Integer impressions;
    /**
     * acos
     */
    @JsonProperty("acos")
    private String acos;
    /**
     * organicImpressions
     */
    @JsonProperty("organic_impressions")
    private Integer organicImpressions;
    /**
     * gmv
     */
    @JsonProperty("gmv")
    private Money gmv;
    /**
     * pbGmv
     */
    @JsonProperty("pb_gmv")
    private Money pbGmv;
}
