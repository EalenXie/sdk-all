package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import io.github.ealenxie.allegro.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:42
 * @version 1.0
 */
@Getter
@Setter
public class RefundPayload {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * commission
     */
    @JsonProperty("commission")
    private Money commission;
    /**
     * buyer
     */
    @JsonProperty("buyer")
    private User buyer;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * lineItem
     */
    @JsonProperty("lineItem")
    private LineItem lineItem;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
