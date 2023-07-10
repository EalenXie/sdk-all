package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:22
 */
@NoArgsConstructor
@Data
public class CreateFulfillmentPayload {

    /**
     * header
     */
    @JsonProperty("header")
    private Header header;
    /**
     * payload
     */
    @JsonProperty("payload")
    private FulfillmentPayload payload;
}
