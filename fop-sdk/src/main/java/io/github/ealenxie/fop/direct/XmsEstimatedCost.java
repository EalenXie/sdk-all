package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 15:03
 */
@Getter
@Setter
public class XmsEstimatedCost {
    /**
     * 4PX单号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * 计费重/体积重(若是泡货，则返回相应的体积重；若非泡货，则不返回)
     */
    @JsonProperty("charge_weight")
    private String chargeWeight;

    /**
     * 预计送达天数
     */
    @JsonProperty("estimated_time")
    private String estimatedTime;

    /**
     * 轨迹是否可跟踪(Y/N)
     */
    @JsonProperty("is_show_track")
    private String isShowTrack;

    /**
     * 是否泡货(Y/N)
     */
    @JsonProperty("is_volume_cargo")
    private String isVolumeCargo;

    /**
     * 服务商单号
     */
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;

    /**
     * 物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 总费用(CNY)
     */
    @JsonProperty("lump_sum_fee")
    private String lumpSumFee;

    /**
     * 客户单号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 备注说明
     */
    @JsonProperty("remarks")
    private String remarks;
}
