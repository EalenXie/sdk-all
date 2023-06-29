package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:30
 */
@Getter
@Setter
public class SearchOffersQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("offer.id")
    private String offerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("name")
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sellingMode.price.amount.gte")
    private Double sellingModePriceAmountGte;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sellingMode.price.amount.lte")
    private Double sellingModePriceAmountLte;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("publication.status")
    private List<String> publicationStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("publication.marketplace")
    private String publicationMarketplace;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sellingMode.format")
    private List<String> sellingModeFormat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("external.id")
    private List<String> externalId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("delivery.shippingRates.id")
    private String deliveryShippingRatesId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("delivery.shippingRates.id.empty")
    private Boolean deliveryShippingRatesIdEmpty;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sort")
    private String sort;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("offset")
    private Integer offset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("category.id")
    private String categoryId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("product.id.empty")
    private Boolean productIdEmpty;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("productizationRequired")
    private Boolean productizationRequired;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("b2b.buyableOnlyByBusiness")
    private Boolean b2bBuyableOnlyByBusiness;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fundraisingCampaign.id")
    private String fundraisingCampaignId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fundraisingCampaign.id.empty")
    private Boolean fundraisingCampaignIdEmpty;


}
