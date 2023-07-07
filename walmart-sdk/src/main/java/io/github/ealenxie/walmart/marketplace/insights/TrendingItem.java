package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:45
 */
@Getter
@Setter
public class TrendingItem {
    /**
     * departmentName
     */
    @JsonProperty("departmentName")
    private String departmentName;
    /**
     * isbn
     */
    @JsonProperty("isbn")
    private String isbn;
    /**
     * categoryName
     */
    @JsonProperty("categoryName")
    private String categoryName;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * subCategoryName
     */
    @JsonProperty("subCategoryName")
    private String subCategoryName;
    /**
     * isTwoDayEligible
     */
    @JsonProperty("isTwoDayEligible")
    private Integer isTwoDayEligible;
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * totalOffers
     */
    @JsonProperty("totalOffers")
    private Integer totalOffers;
    /**
     * issn
     */
    @JsonProperty("issn")
    private String issn;
    /**
     * superDepartmentName
     */
    @JsonProperty("superDepartmentName")
    private String superDepartmentName;
    /**
     * existsForSeller
     */
    @JsonProperty("existsForSeller")
    private Integer existsForSeller;
    /**
     * rank
     */
    @JsonProperty("rank")
    private Integer rank;
    /**
     * brand
     */
    @JsonProperty("brand")
    private String brand;
}
