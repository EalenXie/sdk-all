package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:45
 */
@NoArgsConstructor
@Data
public class SaleProductResponse {


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
    private ProductsCategory category;
    /**
     * images
     */
    @JsonProperty("images")
    private List<Images> images;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ProductsParameters> parameters;
    /**
     * offerRequirements
     */
    @JsonProperty("offerRequirements")
    private OfferRequirements offerRequirements;
    /**
     * compatibilityList
     */
    @JsonProperty("compatibilityList")
    private SaleProductCompatibilityList compatibilityList;
    /**
     * tecdocSpecification
     */
    @JsonProperty("tecdocSpecification")
    private TecdocSpecification tecdocSpecification;
    /**
     * description
     */
    @JsonProperty("description")
    private Description description;
    /**
     * isDraft
     */
    @JsonProperty("isDraft")
    private Boolean isDraft;
}
