package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:41
 */
@Getter
@Setter
public class InboundCreateResponse {

    /**
     * 4PX跟踪号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 入库标签条码号
     */
    @JsonProperty("label_barcode")
    private String labelBarcode;

    /**
     * 入库委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

}
