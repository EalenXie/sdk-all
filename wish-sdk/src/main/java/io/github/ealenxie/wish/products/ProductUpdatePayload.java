package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 17:11
 */
@Getter
@Setter
public class ProductUpdatePayload {

    /**
     * californiaProp65ChemicalNames
     */
    @JsonProperty("california_prop65_chemical_names")
    private List<String> californiaProp65ChemicalNames;
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
     * subcategoryId
     */
    @JsonProperty("subcategory_id")
    private Integer subcategoryId;
    /**
     * californiaProp65WarningType
     */
    @JsonProperty("california_prop65_warning_type")
    private String californiaProp65WarningType;
    /**
     * maxQuantity
     */
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    /**
     * referenceValue
     */
    @JsonProperty("reference_value")
    private Integer referenceValue;
    /**
     * warehouseToShippings
     */
    @JsonProperty("warehouse_to_shippings")
    private List<WarehouseToShippings> warehouseToShippings;
    /**
     * msrp
     */
    @JsonProperty("msrp")
    private Money msrp;
    /**
     * video
     */
    @JsonProperty("video")
    private Video video;
    /**
     * condition
     */
    @JsonProperty("condition")
    private String condition;
    /**
     * brandId
     */
    @JsonProperty("brand_id")
    private String brandId;
    /**
     * attributes
     */
    @JsonProperty("attributes")
    private List<Attributes> attributes;
    /**
     * parentSku
     */
    @JsonProperty("parent_sku")
    private String parentSku;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * firstMileShippings
     */
    @JsonProperty("first_mile_shippings")
    private List<FirstMileShippingsPayload> firstMileShippings;
    /**
     * mainImage
     */
    @JsonProperty("main_image")
    private MainImage mainImage;
    /**
     * variations
     */
    @JsonProperty("variations")
    private List<VariationsUpdatePayload> variations;
    /**
     * extraImages
     */
    @JsonProperty("extra_images")
    private List<ExtraImage> extraImages;
}
