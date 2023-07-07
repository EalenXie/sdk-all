package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 15:00
 */
@Getter
@Setter
public class ProductType {
    /**
     * productTypeName
     */
    @JsonProperty("productTypeName")
    private String productTypeName;
    /**
     * offerCount
     */
    @JsonProperty("offerCount")
    private Integer offerCount;
}
