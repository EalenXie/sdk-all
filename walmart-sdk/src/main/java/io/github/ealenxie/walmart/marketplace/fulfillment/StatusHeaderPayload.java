package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:31
 */
@Setter
@Getter
public class StatusHeaderPayload<T> extends HeaderPayload<T> {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
