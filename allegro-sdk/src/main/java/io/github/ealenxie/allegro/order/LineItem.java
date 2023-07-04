package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:43
 * @version 1.0
 */
@Getter
@Setter
public class LineItem {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * boughtAt
     */
    @JsonProperty("boughtAt")
    private String boughtAt;
    /**
     * offer
     */
    @JsonProperty("offer")
    private Offer offer;
}
