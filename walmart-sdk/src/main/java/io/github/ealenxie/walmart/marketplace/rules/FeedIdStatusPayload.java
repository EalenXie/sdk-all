package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 9:56
 */
@NoArgsConstructor
@Data
public class FeedIdStatusPayload {

    /**
     * feedId
     */
    @JsonProperty("feedId")
    private String feedId;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
