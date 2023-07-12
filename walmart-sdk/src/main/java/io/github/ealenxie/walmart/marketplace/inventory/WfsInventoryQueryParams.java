package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/12 11:07
 * @version 1.0
 */
@Getter
@Setter
public class WfsInventoryQueryParams {
    /**
     * sku
     */
    @JsonProperty("sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sku;
    /**
     * fromModifiedDate
     */
    @JsonProperty("fromModifiedDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fromModifiedDate;
    /**
     * toModifiedDate
     */
    @JsonProperty("toModifiedDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String toModifiedDate;
    /**
     * limit
     */
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
    /**
     * offset
     */
    @JsonProperty("offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;
}
