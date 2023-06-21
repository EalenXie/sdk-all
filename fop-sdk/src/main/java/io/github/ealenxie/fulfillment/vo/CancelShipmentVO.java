package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 取消派送委托单
 */
@Getter
@Setter
public class CancelShipmentVO {
    /**
     * 派送委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
}
