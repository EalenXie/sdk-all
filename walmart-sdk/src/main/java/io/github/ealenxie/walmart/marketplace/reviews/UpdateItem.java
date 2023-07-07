package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:43
 */
@Getter
@Setter
public class UpdateItem {
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
}
