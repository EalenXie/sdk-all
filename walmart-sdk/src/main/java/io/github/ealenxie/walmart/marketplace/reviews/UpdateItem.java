package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:43
 */
@NoArgsConstructor
@Data
public class UpdateItem {
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
}
