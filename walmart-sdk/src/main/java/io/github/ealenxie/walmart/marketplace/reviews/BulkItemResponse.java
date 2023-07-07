package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:45
 */
@Getter
@Setter
public class BulkItemResponse {
    /**
     * success
     */
    @JsonProperty("success")
    private Success success;
    /**
     * failure
     */
    @JsonProperty("failure")
    private Failure failure;
}
