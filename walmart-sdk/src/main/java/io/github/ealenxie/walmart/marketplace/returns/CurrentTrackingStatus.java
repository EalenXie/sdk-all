package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class CurrentTrackingStatus {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * statusTime
     */
    @JsonProperty("statusTime")
    private String statusTime;
    /**
     * currentRefundStatus
     */
    @JsonProperty("currentRefundStatus")
    private String currentRefundStatus;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Qty quantity;
}
