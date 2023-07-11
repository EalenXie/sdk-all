package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 11:07
 */
@Getter
@Setter
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
