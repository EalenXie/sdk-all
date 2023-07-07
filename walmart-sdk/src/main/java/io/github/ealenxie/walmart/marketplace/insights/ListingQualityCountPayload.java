package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 15:00
 */
@Getter
@Setter
public class ListingQualityCountPayload {
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * offerCount
     */
    @JsonProperty("offerCount")
    private Integer offerCount;
    /**
     * productType
     */
    @JsonProperty("productType")
    private List<ProductType> productType;
}
