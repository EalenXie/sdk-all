package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 17:05
 */
@Getter
@Setter
public class ProductSyncPayload {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * californiaProp65ChemicalNames
     */
    @JsonProperty("california_prop65_chemical_names")
    private List<String> californiaProp65ChemicalNames;
    /**
     * referenceValue
     */
    @JsonProperty("reference_value")
    private Integer referenceValue;
    /**
     * isPromoted
     */
    @JsonProperty("is_promoted")
    private Boolean isPromoted;
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
     * condition
     */
    @JsonProperty("condition")
    private String condition;
    /**
     * updatedAt
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * numSaves
     */
    @JsonProperty("num_saves")
    private Integer numSaves;
    /**
     * brandId
     */
    @JsonProperty("brand_id")
    private String brandId;
    /**
     * categoryExperienceEligibility
     */
    @JsonProperty("category_experience_eligibility")
    private Boolean categoryExperienceEligibility;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * numSold
     */
    @JsonProperty("num_sold")
    private Integer numSold;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * parentSku
     */
    @JsonProperty("parent_sku")
    private String parentSku;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * msrp
     */
    @JsonProperty("msrp")
    private Money msrp;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;


}
