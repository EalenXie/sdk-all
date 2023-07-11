package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 9:56
 */
@Getter
@Setter
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
