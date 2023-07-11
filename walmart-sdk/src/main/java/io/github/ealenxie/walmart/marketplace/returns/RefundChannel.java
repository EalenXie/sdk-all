package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class RefundChannel {
    /**
     * refundChannelName
     */
    @JsonProperty("refundChannelName")
    private String refundChannelName;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Quantity quantity;
}
