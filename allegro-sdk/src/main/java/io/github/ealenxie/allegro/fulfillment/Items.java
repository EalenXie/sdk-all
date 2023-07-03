package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 10:00
 * @version 1.0
 */
@Getter
@Setter
public class Items {
    /**
     * productId
     */
    @JsonProperty("productId")
    private String productId;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * serialNumbers
     */
    @JsonProperty("serialNumbers")
    private List<String> serialNumbers;
    /**
     * expirationDate
     */
    @JsonProperty("expirationDate")
    private String expirationDate;
    /**
     * offerId
     */
    @JsonProperty("offerId")
    private String offerId;
}
