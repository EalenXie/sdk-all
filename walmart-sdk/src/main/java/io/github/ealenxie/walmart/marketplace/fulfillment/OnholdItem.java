package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 11:08
 */
@NoArgsConstructor
@Data
public class OnholdItem {
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
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * subCategory
     */
    @JsonProperty("subCategory")
    private String subCategory;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private Long createdAt;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private Long updatedAt;
    /**
     * primaryImage
     */
    @JsonProperty("primaryImage")
    private String primaryImage;
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Error> errors;
}
