package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 14:34
 * @version 1.0
 */
@Getter
@Setter
public class ProductIdentifier {
    /**
     * productIdType
     */
    @JsonProperty("productIdType")
    private String productIdType;
    /**
     * productId
     */
    @JsonProperty("productId")
    private String productId;
}
