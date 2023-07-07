package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:44
 */
@NoArgsConstructor
@Data
public class BulkItemResponse {


    /**
     * statusCode
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * payload
     */
    @JsonProperty("payload")
    private BulkItemResponsePayload payload;
}
