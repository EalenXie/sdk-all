package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@Getter
@Setter
public class ItemListingDetailsResponse {

    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    private String nextCursor;
    /**
     * totalItems
     */
    @JsonProperty("totalItems")
    private Integer totalItems;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<ItemListingDetailPayload> payload;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
