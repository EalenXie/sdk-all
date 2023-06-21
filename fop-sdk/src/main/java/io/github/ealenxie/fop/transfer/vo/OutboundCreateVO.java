package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:41
 */
@Getter
@Setter
public class OutboundCreateVO {

    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    @JsonProperty("consignment_no")
    private String consignmentNo;

}
