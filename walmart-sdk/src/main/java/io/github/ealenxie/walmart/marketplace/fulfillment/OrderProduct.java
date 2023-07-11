package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@NoArgsConstructor
@Data
public class OrderProduct {
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
}
