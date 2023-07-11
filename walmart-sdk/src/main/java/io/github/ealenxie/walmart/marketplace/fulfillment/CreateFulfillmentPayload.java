package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:22
 */
@Getter
@Setter
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
