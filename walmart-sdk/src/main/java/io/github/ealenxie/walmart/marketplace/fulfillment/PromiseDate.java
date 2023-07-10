package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@NoArgsConstructor
@Data
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
