package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@Getter
@Setter
public class Tax {
    /**
     * taxName
     */
    @JsonProperty("taxName")
    private String taxName;
    /**
     * taxAmount
     */
    @JsonProperty("taxAmount")
    private Money taxAmount;
}
