package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.TypePayload;
import io.github.ealenxie.allegro.UrlPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 15:17
 * @version 1.0
 */
@Getter
@Setter
public class AllegroOffer {
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private AdditionalMarketplacesPayload additionalMarketplaces;
    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private Offer additionalServices;
    /**
     * afterSalesServices
     */
    @JsonProperty("afterSalesServices")
    private AfterSalesServices afterSalesServices;
    /**
     * attachments
     */
    @JsonProperty("attachments")
    private List<Tax> attachments;
    /**
     * compatibilityList
     */
    @JsonProperty("compatibilityList")
    private TypePayload compatibilityList;
    /**
     * contact
     */
    @JsonProperty("contact")
    private Offer contact;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * customParameters
     */
    @JsonProperty("customParameters")
    private List<CustomParameter> customParameters;
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private AllegroDelivery delivery;
    /**
     * description
     */
    @JsonProperty("description")
    private SectionsPayload description;
    /**
     * discounts
     */
    @JsonProperty("discounts")
    private Discounts discounts;
    /**
     * external
     */
    @JsonProperty("external")
    private Offer external;
    /**
     * fundraisingCampaign
     */
    @JsonProperty("fundraisingCampaign")
    private Offer fundraisingCampaign;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * images
     */
    @JsonProperty("images")
    private List<UrlPayload> images;
    /**
     * location
     */
    @JsonProperty("location")
    private Location location;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<Parameter> parameters;
    /**
     * payments
     */
    @JsonProperty("payments")
    private Payments payments;
    /**
     * product
     */
    @JsonProperty("product")
    private Offer product;
    /**
     * promotion
     */
    @JsonProperty("promotion")
    private Promotion promotion;
    /**
     * publication
     */
    @JsonProperty("publication")
    private PublishPayload publication;
    /**
     * sellingMode
     */
    @JsonProperty("sellingMode")
    private SellingModePayload sellingMode;
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
     * sizeTable
     */
    @JsonProperty("sizeTable")
    private Tax sizeTable;
    /**
     * stock
     */
    @JsonProperty("stock")
    private StockUnit stock;
    /**
     * tecdocSpecification
     */
    @JsonProperty("tecdocSpecification")
    private TecdocSpecification tecdocSpecification;
    /**
     * b2b
     */
    @JsonProperty("b2b")
    private B2b b2b;
    /**
     * messageToSellerSettings
     */
    @JsonProperty("messageToSellerSettings")
    private MessageToSellerSettings messageToSellerSettings;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * validation
     */
    @JsonProperty("validation")
    private Validation validation;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
}
