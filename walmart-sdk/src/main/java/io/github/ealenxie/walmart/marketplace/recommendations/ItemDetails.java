package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:35
 */
@Getter
@Setter
public class ItemDetails {
    /**
     * title
     */
    @JsonProperty("title")
    private String title;
    /**
     * brand
     */
    @JsonProperty("brand")
    private String brand;
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * upc
     */
    @JsonProperty("upc")
    private String upc;
    /**
     * ean
     */
    @JsonProperty("ean")
    private String ean;
    /**
     * itemAvailabilityStatus
     */
    @JsonProperty("itemAvailabilityStatus")
    private String itemAvailabilityStatus;
    /**
     * walmart
     */
    @JsonProperty("walmart")
    private ItemPricePayload walmart;
    /**
     * competitors
     */
    @JsonProperty("competitors")
    private List<ItemPricePayload> competitors;
}
