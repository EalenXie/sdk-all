package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 14:25
 */
@Getter
@Setter
public class Parameters {
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
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * required
     */
    @JsonProperty("required")
    private Boolean required;
    /**
     * requiredForProduct
     */
    @JsonProperty("requiredForProduct")
    private Boolean requiredForProduct;
    /**
     * requiredIf
     */
    @JsonProperty("requiredIf")
    private RequiredIf requiredIf;
    /**
     * displayedIf
     */
    @JsonProperty("displayedIf")
    private DisplayedIf displayedIf;
    /**
     * unit
     */
    @JsonProperty("unit")
    private Object unit;
    /**
     * options
     */
    @JsonProperty("options")
    private ParametersOptions options;
    /**
     * restrictions
     */
    @JsonProperty("restrictions")
    private Restrictions restrictions;
}
