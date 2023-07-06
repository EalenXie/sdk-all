package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitMoney;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 15:38
 * @version 1.0
 */
@Setter
@Getter
public class Payload {
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * wpid
     */
    @JsonProperty("wpid")
    private String wpid;
    /**
     * lifecycleStatus
     */
    @JsonProperty("lifecycleStatus")
    private String lifecycleStatus;
    /**
     * mart
     */
    @JsonProperty("mart")
    private String mart;
    /**
     * publishedStatus
     */
    @JsonProperty("publishedStatus")
    private PublishedStatus publishedStatus;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * manufacturer
     */
    @JsonProperty("manufacturer")
    private String manufacturer;
    /**
     * shelf
     */
    @JsonProperty("shelf")
    private String shelf;
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * price
     */
    @JsonProperty("price")
    private UnitMoney price;
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
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * brand
     */
    @JsonProperty("brand")
    private String brand;
    /**
     * productType
     */
    @JsonProperty("productType")
    private String productType;
    /**
     * upc
     */
    @JsonProperty("upc")
    private String upc;
}
