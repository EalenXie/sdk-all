package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.NameValuePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:44
 * @version 1.0
 */
@Getter
@Setter
public class VariantData {
    /**
     * productImageUrl
     */
    @JsonProperty("productImageUrl")
    private String productImageUrl;
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * isAvailable
     */
    @JsonProperty("isAvailable")
    private String isAvailable;
    /**
     * title
     */
    @JsonProperty("title")
    private String title;
    /**
     * variantValues
     */
    @JsonProperty("variantValues")
    private List<NameValuePayload> variantValues;
}
