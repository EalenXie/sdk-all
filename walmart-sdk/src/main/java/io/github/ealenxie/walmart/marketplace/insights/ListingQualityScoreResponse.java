package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 14:53
 */
@NoArgsConstructor
@Data
public class ListingQualityScoreResponse {


    /**
     * payload
     */
    @JsonProperty("payload")
    private ListingQualityScorePayload payload;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
