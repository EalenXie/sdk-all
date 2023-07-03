package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 10:04
 */
@NoArgsConstructor
@Data
public class OfferPayload {

    /**
     * productSet
     */
    @JsonProperty("productSet")
    private List<ProductSet> productSet;
    /**
     * b2b
     */
    @JsonProperty("b2b")
    private B2b b2b;
    /**
     * attachments
     */
    @JsonProperty("attachments")
    private List<IdNamePayload> attachments;
    /**
     * fundraisingCampaign
     */
    @JsonProperty("fundraisingCampaign")
    private IdNamePayload fundraisingCampaign;
    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private IdNamePayload additionalServices;
    /**
     * stock
     */
    @JsonProperty("stock")
    private StockUnit stock;
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private DeliveryPayload delivery;
    /**
     * publication
     */
    @JsonProperty("publication")
    private PublishPayload publication;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private CreateOffersAdditionalMarketplaces additionalMarketplaces;
    /**
     * compatibilityList
     */
    @JsonProperty("compatibilityList")
    private CompatibilityList compatibilityList;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
    /**
     * category
     */
    @JsonProperty("category")
    private IdNamePayload category;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ParametersPayload> parameters;
    /**
     * afterSalesServices
     */
    @JsonProperty("afterSalesServices")
    private AfterSalesServices afterSalesServices;
    /**
     * sizeTable
     */
    @JsonProperty("sizeTable")
    private IdNamePayload sizeTable;
    /**
     * discounts
     */
    @JsonProperty("discounts")
    private CreateOffersDiscountsPayload discounts;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * payments
     */
    @JsonProperty("payments")
    private Payments payments;
    /**
     * sellingMode
     */
    @JsonProperty("sellingMode")
    private SellingMode sellingMode;
    /**
     * location
     */
    @JsonProperty("location")
    private Location location;
    /**
     * images
     */
    @JsonProperty("images")
    private List<String> images;
    /**
     * description
     */
    @JsonProperty("description")
    private Description description;
    /**
     * external
     */
    @JsonProperty("external")
    private IdNamePayload external;
    /**
     * tax
     */
    @JsonProperty("tax")
    private Tax tax;
    /**
     * taxSettings
     */
    @JsonProperty("taxSettings")
    private TaxSettings taxSettings;
    /**
     * messageToSellerSettings
     */
    @JsonProperty("messageToSellerSettings")
    private MessageToSellerSettings messageToSellerSettings;
}
