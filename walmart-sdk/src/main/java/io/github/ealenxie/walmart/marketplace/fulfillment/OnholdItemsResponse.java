package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 11:07
 */
@NoArgsConstructor
@Data
public class OnholdItemsResponse {

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
     * actionNeeded
     */
    @JsonProperty("actionNeeded")
    private Integer actionNeeded;
    /**
     * inReview
     */
    @JsonProperty("inReview")
    private Integer inReview;
    /**
     * prohibited
     */
    @JsonProperty("prohibited")
    private Integer prohibited;
    /**
     * items
     */
    @JsonProperty("items")
    private List<OnholdItem> items;
}
