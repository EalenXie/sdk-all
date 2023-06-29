package io.github.ealenxie.fop.fulfillment;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CancelShipment {

    /**
     * 派送委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 取消原因备注
     */
    @JsonProperty("cancel_remark")
    private String cancelRemark;
}
