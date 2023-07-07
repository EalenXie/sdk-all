package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 15:00
 */
@NoArgsConstructor
@Data
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
