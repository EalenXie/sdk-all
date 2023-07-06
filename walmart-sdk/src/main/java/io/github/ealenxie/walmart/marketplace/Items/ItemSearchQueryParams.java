package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:42
 * @version 1.0
 */
@Getter
@Setter
public class ItemSearchQueryParams {
    /**
     * query
     */
    @JsonProperty("query")
    private String query;
    /**
     * upc
     */
    @JsonProperty("upc")
    private String upc;
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
}
