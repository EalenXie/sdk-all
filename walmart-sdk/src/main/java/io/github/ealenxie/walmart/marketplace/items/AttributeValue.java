package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:32
 * @version 1.0
 */
@Getter
@Setter
public class AttributeValue {
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
    /**
     * group
     */
    @JsonProperty("group")
    private String group;
    /**
     * source
     */
    @JsonProperty("source")
    private String source;
    /**
     * rank
     */
    @JsonProperty("rank")
    private Integer rank;
    /**
     * isVariant
     */
    @JsonProperty("isVariant")
    private Boolean isVariant;

}
