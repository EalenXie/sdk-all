package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:41
 */
@Getter
@Setter
public class InboundCreateVO {

    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    @JsonProperty("label_barcode")
    private String labelBarcode;

    @JsonProperty("consignment_no")
    private String consignmentNo;

}
