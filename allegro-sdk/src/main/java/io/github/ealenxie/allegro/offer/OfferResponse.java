package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 10:24
 */
@NoArgsConstructor
@Data
public class OfferResponse {


    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * productSet
     */
    @JsonProperty("productSet")
    private List<ProductSetResponse> productSet;
    /**
     * category
     */
    @JsonProperty("category")
    private IdPayload category;
    /**
     * attachments
     */
    @JsonProperty("attachments")
    private List<ProductResponse> attachments;
    /**
     * fundraisingCampaign
     */
    @JsonProperty("fundraisingCampaign")
    private IdPayload fundraisingCampaign;
    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private IdPayload additionalServices;
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
     * b2b
     */
    @JsonProperty("b2b")
    private B2b b2b;
    /**
     * compatibilityList
     */
    @JsonProperty("compatibilityList")
    private TypePayload compatibilityList;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
    /**
     * validation
     */
    @JsonProperty("validation")
    private Validation validation;
    /**
     * afterSalesServices
     */
    @JsonProperty("afterSalesServices")
    private AfterSalesServices afterSalesServices;
    /**
     * discounts
     */
    @JsonProperty("discounts")
    private Discounts discounts;
    /**
     * stock
     */
    @JsonProperty("stock")
    private StockUnit stock;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ParametersPayload> parameters;
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
     * updatedAt
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
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
    private IdPayload external;
    /**
     * sizeTable
     */
    @JsonProperty("sizeTable")
    private IdPayload sizeTable;
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
