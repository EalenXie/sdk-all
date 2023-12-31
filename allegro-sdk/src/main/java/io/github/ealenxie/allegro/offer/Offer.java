package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.UrlPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@Getter
@Setter
public class Offer {
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
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
    /**
     * primaryImage
     */
    @JsonProperty("primaryImage")
    private UrlPayload primaryImage;
    /**
     * sellingMode
     */
    @JsonProperty("sellingMode")
    private SellingMode sellingMode;
    /**
     * saleInfo
     */
    @JsonProperty("saleInfo")
    private SaleInfo saleInfo;
    /**
     * stock
     */
    @JsonProperty("stock")
    private Stock stock;
    /**
     * stats
     */
    @JsonProperty("stats")
    private Stats stats;
    /**
     * publication
     */
    @JsonProperty("publication")
    private Publish publication;
    /**
     * afterSalesServices
     */
    @JsonProperty("afterSalesServices")
    private AfterSalesServices afterSalesServices;
    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private IdPayload additionalServices;
    /**
     * external
     */
    @JsonProperty("external")
    private IdPayload external;
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * b2b
     */
    @JsonProperty("b2b")
    private B2b b2b;
    /**
     * fundraisingCampaign
     */
    @JsonProperty("fundraisingCampaign")
    private IdPayload fundraisingCampaign;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private OfferAdditionalMarketplaces additionalMarketplaces;
}
