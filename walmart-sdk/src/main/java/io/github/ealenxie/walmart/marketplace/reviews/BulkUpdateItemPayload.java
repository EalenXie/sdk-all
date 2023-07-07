package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 12:42
 */
@NoArgsConstructor
@Data
public class BulkUpdateItemPayload {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * items
     */
    @JsonProperty("items")
    private List<UpdateItem> items;
}
