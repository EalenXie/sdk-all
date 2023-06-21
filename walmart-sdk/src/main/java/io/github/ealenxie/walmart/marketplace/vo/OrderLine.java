package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:29
 */
@Getter
@Setter
public class OrderLine {
    /**
     * 最近订单状态变更日期
     */
    @JsonProperty("statusDate")
    private Long statusDate;
    @JsonProperty("item")
    private Item item;
    @JsonProperty("charges")
    private Charges charges;
    @JsonProperty("orderLineStatuses")
    private OrderLineStatuses orderLineStatuses;
    @JsonProperty("orderLineQuantity")
    private OrderLineQuantity orderLineQuantity;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("lineNumber")
    private String lineNumber;
}
