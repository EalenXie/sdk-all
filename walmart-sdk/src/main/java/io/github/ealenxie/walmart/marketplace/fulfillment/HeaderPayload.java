package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:32
 */
@Getter
@Setter
public class HeaderPayload<T> {

    @JsonProperty("header")
    private Header header;
    /**
     * payload
     */
    @JsonProperty("payload")
    private T payload;
}
