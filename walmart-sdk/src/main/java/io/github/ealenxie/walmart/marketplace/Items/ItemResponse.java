package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:18
 * @version 1.0
 */
@Getter
@Setter
public class ItemResponse {
    /**
     * mart
     */
    @JsonProperty("mart")
    private String mart;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * wpid
     */
    @JsonProperty("wpid")
    private String wpid;
    /**
     * upc
     */
    @JsonProperty("upc")
    private String upc;
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * shelf
     */
    @JsonProperty("shelf")
    private String shelf;
    /**
     * productType
     */
    @JsonProperty("productType")
    private String productType;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * publishedStatus
     */
    @JsonProperty("publishedStatus")
    private String publishedStatus;
    /**
     * unpublishedReasons
     */
    @JsonProperty("unpublishedReasons")
    private UnpublishedReasons unpublishedReasons;
    /**
     * lifecycleStatus
     */
    @JsonProperty("lifecycleStatus")
    private String lifecycleStatus;
    /**
     * variantGroupInfo
     */
    @JsonProperty("variantGroupInfo")
    private VariantGroupInfo variantGroupInfo;
    /**
     * variantGroupId
     */
    @JsonProperty("variantGroupId")
    private String variantGroupId;
}
