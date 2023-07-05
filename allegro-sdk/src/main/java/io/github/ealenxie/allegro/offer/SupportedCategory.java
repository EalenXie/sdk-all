package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 12:54
 */
@NoArgsConstructor
@Data
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
