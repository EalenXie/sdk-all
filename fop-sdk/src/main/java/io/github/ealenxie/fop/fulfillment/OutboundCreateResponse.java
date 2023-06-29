package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutboundCreateResponse {
    /**
     * 委托单号，用改单号作为物流号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 物流追踪号
     */
    @JsonProperty("4px_tracking_no")
    private String trackingNo;
}
