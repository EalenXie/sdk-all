package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.offer.StockUnit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Regular {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * seller
     */
    @JsonProperty("seller")
    private Seller seller;
    /**
     * promotion
     */
    @JsonProperty("promotion")
    private Promotion promotion;
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * images
     */
    @JsonProperty("images")
    private List<Vendor> images;
    /**
     * sellingMode
     */
    @JsonProperty("sellingMode")
    private SellingMode sellingMode;
    /**
     * stock
     */
    @JsonProperty("stock")
    private StockUnit stock;
    /**
     * vendor
     */
    @JsonProperty("vendor")
    private Vendor vendor;
    /**
     * category
     */
    @JsonProperty("category")
    private Seller category;
    /**
     * publication
     */
    @JsonProperty("publication")
    private Publication publication;

}
