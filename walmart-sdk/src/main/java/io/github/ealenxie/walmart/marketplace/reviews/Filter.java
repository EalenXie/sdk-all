package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:50
 */
@Getter
@Setter
public class Filter {
    /**
     * itemStatus
     */
    @JsonProperty("itemStatus")
    private String itemStatus;
}
