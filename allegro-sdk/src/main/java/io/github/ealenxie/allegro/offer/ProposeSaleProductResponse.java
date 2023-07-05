package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.UrlPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 11:00
 */
@Getter
@Setter
public class ProposeSaleProductResponse {


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
    private List<UrlPayload> images;
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
    private SectionsPayload description;
    /**
     * isDraft
     */
    @JsonProperty("isDraft")
    private Boolean isDraft;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
}
