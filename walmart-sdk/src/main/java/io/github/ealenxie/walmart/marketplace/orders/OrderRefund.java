package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:05
 */
@Getter
@Setter
public class OrderRefund {
    /**
     * purchaseOrderId
     */
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    /**
     * orderLines
     */
    @JsonProperty("orderLines")
    private RefundOrderLines orderLines;
}
