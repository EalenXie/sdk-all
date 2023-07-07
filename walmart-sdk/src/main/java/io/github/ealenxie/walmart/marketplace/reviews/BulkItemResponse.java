package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:45
 */
@NoArgsConstructor
@Data
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
