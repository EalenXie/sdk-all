package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:59
 * @version 1.0
 */
@Getter
@Setter
public class VariantPayload {
    /**
     * variantGroupId
     */
    @JsonProperty("variantGroupId")
    private String variantGroupId;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
}
