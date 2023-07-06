package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:18
 * @version 1.0
 */
@Getter
@Setter
public class ItemPayload {

    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Error> errors;
    /**
     * itemResponse
     */
    @JsonProperty("ItemResponse")
    private List<ItemResponse> itemResponse;
    /**
     * additionalAttributes
     */
    @JsonProperty("additionalAttributes")
    private List<AttributePayload> additionalAttributes;
    /**
     * totalItems
     */
    @JsonProperty("totalItems")
    private Integer totalItems;
    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    private String nextCursor;
}
