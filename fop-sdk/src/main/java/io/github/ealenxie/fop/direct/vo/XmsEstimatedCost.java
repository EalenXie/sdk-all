package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 15:03
 */
@Getter
@Setter
public class XmsEstimatedCost {
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    @JsonProperty("charge_weight")
    private String chargeWeight;
    @JsonProperty("estimated_time")
    private String estimatedTime;
    @JsonProperty("is_show_track")
    private String isShowTrack;
    @JsonProperty("is_volume_cargo")
    private String isVolumeCargo;
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    @JsonProperty("lump_sum_fee")
    private String lumpSumFee;
    @JsonProperty("ref_no")
    private String refNo;
    @JsonProperty("remarks")
    private String remarks;
}
