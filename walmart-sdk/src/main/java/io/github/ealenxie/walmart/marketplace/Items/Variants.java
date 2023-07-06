package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.NamePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:44
 * @version 1.0
 */
@Getter
@Setter
public class Variants {
    /**
     * variantMeta
     */
    @JsonProperty("variantMeta")
    private List<NamePayload> variantMeta;
    /**
     * variantData
     */
    @JsonProperty("variantData")
    private List<VariantData> variantData;
}
