package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import io.github.ealenxie.walmart.marketplace.UrlPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:44
 * @version 1.0
 */
@Getter
@Setter
public class ItemSearch {
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * isMarketPlaceItem
     */
    @JsonProperty("isMarketPlaceItem")
    private Boolean isMarketPlaceItem;
    /**
     * images
     */
    @JsonProperty("images")
    private List<UrlPayload> images;
    /**
     * customerRating
     */
    @JsonProperty("customerRating")
    private String customerRating;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
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
     * productType
     */
    @JsonProperty("productType")
    private String productType;
    /**
     * properties
     */
    @JsonProperty("properties")
    private Properties properties;
}
