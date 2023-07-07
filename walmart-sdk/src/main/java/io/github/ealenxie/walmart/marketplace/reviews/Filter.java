package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:50
 */
@NoArgsConstructor
@Data
public class Filter {
    /**
     * itemStatus
     */
    @JsonProperty("itemStatus")
    private String itemStatus;
}
