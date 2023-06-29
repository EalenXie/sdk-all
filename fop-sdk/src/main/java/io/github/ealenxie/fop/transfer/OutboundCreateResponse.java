package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:41
 */
@Getter
@Setter
public class OutboundCreateResponse {
    /**
     * 4PX跟踪号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 入库委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

}
