package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:00
 */
@Getter
@Setter
public class CreateXmsOrderResp {

    @JsonProperty("ds_consignment_no")
    private String dsConsignmentNo;
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    @JsonProperty("label_barcode")
    private String labelBarcode;
    @JsonProperty("logistics_channel_name")
    private String logisticsChannelName;
    @JsonProperty("ref_no")
    private String refNo;
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;
}
