package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 12:54
 */
@Getter
@Setter
public class SupportedCategory {
    /**
     * categoryId
     */
    @JsonProperty("categoryId")
    private String categoryId;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * itemsType
     */
    @JsonProperty("itemsType")
    private String itemsType;
    /**
     * inputType
     */
    @JsonProperty("inputType")
    private String inputType;
    /**
     * validationRules
     */
    @JsonProperty("validationRules")
    private ValidationRules validationRules;
}
