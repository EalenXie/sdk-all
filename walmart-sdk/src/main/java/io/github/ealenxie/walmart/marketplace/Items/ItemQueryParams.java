package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:14
 * @version 1.0
 */
@Getter
@Setter
public class ItemQueryParams extends PageQueryParams {

    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nextCursor;

    /**
     * sku
     */
    @JsonProperty("sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sku;

    /**
     * lifecycleStatus
     */
    @JsonProperty("lifecycleStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lifecycleStatus;

    /**
     * publishedStatus
     */
    @JsonProperty("publishedStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String publishedStatus;

    /**
     * variantGroupId
     */
    @JsonProperty("variantGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String variantGroupId;
}
