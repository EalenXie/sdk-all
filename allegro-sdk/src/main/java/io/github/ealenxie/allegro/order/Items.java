package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:21
 * @version 1.0
 */
@Getter
@Setter
public class Items {
    /**
     * offerId
     */
    @JsonProperty("offerId")
    private String offerId;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
    /**
     * reason
     */
    @JsonProperty("reason")
    private CustomerReason reason;
}
