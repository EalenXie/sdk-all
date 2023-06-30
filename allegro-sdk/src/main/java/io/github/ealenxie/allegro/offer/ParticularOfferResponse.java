package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class ParticularOfferResponse {


    /**
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private AdditionalMarketplacesPayload additionalMarketplaces;
    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private IdPayload additionalServices;
    /**
     * afterSalesServices
     */
    @JsonProperty("afterSalesServices")
    private AfterSalesServices afterSalesServices;
    /**
     * attachments
     */
    @JsonProperty("attachments")
    private List<IdPayload> attachments;
    /**
     * compatibilityList
     */
    @JsonProperty("compatibilityList")
    private TypePayload compatibilityList;
    /**
     * contact
     */
    @JsonProperty("contact")
    private IdPayload contact;
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
    private ParticularOfferDelivery delivery;
    /**
     * description
     */
    @JsonProperty("description")
    private Description description;
    /**
     * discounts
     */
    @JsonProperty("discounts")
    private Discounts discounts;
    /**
     * external
     */
    @JsonProperty("external")
    private IdPayload external;
    /**
     * fundraisingCampaign
     */
    @JsonProperty("fundraisingCampaign")
    private IdPayload fundraisingCampaign;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * images
     */
    @JsonProperty("images")
    private List<Images> images;
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
    private IdPayload product;
    /**
     * promotion
     */
    @JsonProperty("promotion")
    private Promotion promotion;
    /**
     * publication
     */
    @JsonProperty("publication")
    private ParticularOfferPublication publication;
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
    private IdPayload sizeTable;
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
