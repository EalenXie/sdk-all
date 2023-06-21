package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class OutboundCancelVO {
    /**
     * 委托单号，用改单号作为物流号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 委托单状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * 出库委托参考号
     */
    @JsonProperty("ref_no")
    private String refNo;
}
