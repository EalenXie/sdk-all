package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:58
 */
@NoArgsConstructor
@Data
public class IrpItemsResponse {


    /**
     * statusCode
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * payload
     */
    @JsonProperty("payload")
    private IrpItemPayload payload;
}
