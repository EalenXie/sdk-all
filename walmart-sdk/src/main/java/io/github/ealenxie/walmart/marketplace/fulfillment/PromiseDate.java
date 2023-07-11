package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@Getter
@Setter
public class PromiseDate {
    /**
     * minPromiseDate
     */
    @JsonProperty("minPromiseDate")
    private String minPromiseDate;
    /**
     * maxPromiseDate
     */
    @JsonProperty("maxPromiseDate")
    private String maxPromiseDate;
}
