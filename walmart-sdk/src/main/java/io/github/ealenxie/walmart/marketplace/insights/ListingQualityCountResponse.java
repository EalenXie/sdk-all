package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 14:59
 */
@NoArgsConstructor
@Data
public class ListingQualityCountResponse {


    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<ListingQualityCountPayload> payload;
}
