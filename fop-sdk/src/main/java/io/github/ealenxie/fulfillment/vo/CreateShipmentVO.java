package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateShipmentVO {
    /**
     * 返回派送委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
}
