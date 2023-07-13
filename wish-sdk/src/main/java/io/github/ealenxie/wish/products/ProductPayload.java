package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 17:17
 */
@NoArgsConstructor
@Data
public class ProductPayload {

    /**
     * referenceValue
     */
    @JsonProperty("reference_value")
    private Integer referenceValue;
    /**
     * subcategoryId
     */
    @JsonProperty("subcategory_id")
    private Integer subcategoryId;
    /**
     * updatedAt
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * brandId
     */
    @JsonProperty("brand_id")
    private String brandId;
    /**
     * video
     */
    @JsonProperty("video")
    private Video video;
    /**
     * numSold
     */
    @JsonProperty("num_sold")
    private Integer numSold;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * isPromoted
     */
    @JsonProperty("is_promoted")
    private Boolean isPromoted;
    /**
     * maxQuantity
     */
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    /**
     * firstMileShippings
     */
    @JsonProperty("first_mile_shippings")
    private List<FirstMileShippings> firstMileShippings;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * defaultShippingPrices
     */
    @JsonProperty("default_shipping_prices")
    private List<DefaultShippingPrices> defaultShippingPrices;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * tags
     */
    @JsonProperty("tags")
    private List<String> tags;
    /**
     * californiaProp65WarningType
     */
    @JsonProperty("california_prop65_warning_type")
    private String californiaProp65WarningType;
    /**
     * numSaves
     */
    @JsonProperty("num_saves")
    private Integer numSaves;
    /**
     * isCspEnabled
     */
    @JsonProperty("is_csp_enabled")
    private Boolean isCspEnabled;
    /**
     * extraImages
     */
    @JsonProperty("extra_images")
    private List<ExtraImage> extraImages;
    /**
     * categoryExperienceEligibility
     */
    @JsonProperty("category_experience_eligibility")
    private Boolean categoryExperienceEligibility;
    /**
     * parentSku
     */
    @JsonProperty("parent_sku")
    private String parentSku;
    /**
     * condition
     */
    @JsonProperty("condition")
    private String condition;
    /**
     * californiaProp65ChemicalNames
     */
    @JsonProperty("california_prop65_chemical_names")
    private List<String> californiaProp65ChemicalNames;
    /**
     * mainImage
     */
    @JsonProperty("main_image")
    private MainImage mainImage;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * warehouseToShippings
     */
    @JsonProperty("warehouse_to_shippings")
    private List<WarehouseToShippings> warehouseToShippings;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * variations
     */
    @JsonProperty("variations")
    private List<Variations> variations;
    /**
     * requestId
     */
    @JsonProperty("request_id")
    private String requestId;
    /**
     * attributes
     */
    @JsonProperty("attributes")
    private List<Attributes> attributes;
    /**
     * msrp
     */
    @JsonProperty("msrp")
    private Money msrp;
}
