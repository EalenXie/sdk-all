package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 12:58
 */
@Getter
@Setter
public class IrpItemPayload {
    /**
     * totalItems
     */
    @JsonProperty("totalItems")
    private Integer totalItems;
    /**
     * fetchedItems
     */
    @JsonProperty("fetchedItems")
    private Integer fetchedItems;
    /**
     * dateRange
     */
    @JsonProperty("dateRange")
    private String dateRange;
    /**
     * scrollId
     */
    @JsonProperty("scrollId")
    private String scrollId;
    /**
     * items
     */
    @JsonProperty("items")
    private List<IrpItem> items;
}
