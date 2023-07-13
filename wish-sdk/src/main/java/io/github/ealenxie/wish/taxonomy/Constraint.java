package io.github.ealenxie.wish.taxonomy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 14:46
 * @version 1.0
 */
@Getter
@Setter
public class Constraint {
    /**
     * entryMode
     */
    @JsonProperty("entry_mode")
    private String entryMode;
    /**
     * maxMultiSelect
     */
    @JsonProperty("max_multi_select")
    private Integer maxMultiSelect;
    /**
     * isVariationAttribute
     */
    @JsonProperty("is_variation_attribute")
    private Boolean isVariationAttribute;
    /**
     * dataType
     */
    @JsonProperty("data_type")
    private String dataType;
    /**
     * dataTypeFormat
     */
    @JsonProperty("data_type_format")
    private String dataTypeFormat;
    /**
     * usage
     */
    @JsonProperty("usage")
    private String usage;
}
