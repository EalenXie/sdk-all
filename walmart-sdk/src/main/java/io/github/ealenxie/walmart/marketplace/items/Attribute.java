package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:30
 * @version 1.0
 */
@Getter
@Setter
public class Attribute {
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
     * isVariant
     */
    @JsonProperty("isVariant")
    private Boolean isVariant;
    /**
     * variantResourceType
     */
    @JsonProperty("variantResourceType")
    private String variantResourceType;
    /**
     * value
     */
    @JsonProperty("value")
    private List<AttributeValue> value;

}
