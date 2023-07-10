package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:31
 */
@Setter
@Getter
public class WalmartPayload<H, P> {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("header")
    private H header;
    /**
     * payload
     */
    @JsonProperty("payload")
    private P payload;
}
