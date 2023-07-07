package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:16
 */
@Getter
@Setter
public class ItemListingDetailsQueryParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private String limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("nextCursor")
    private String nextCursor;
}
