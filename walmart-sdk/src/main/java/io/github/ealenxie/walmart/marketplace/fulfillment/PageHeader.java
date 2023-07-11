package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 14:03
 */
@Getter
@Setter
public class PageHeader {
    /**
     * limit
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * offset
     */
    @JsonProperty("offset")
    private Integer offset;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
