package io.github.ealenxie.fop.fulfillment.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LabelShipment {
    /**
     * 派送委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
}
