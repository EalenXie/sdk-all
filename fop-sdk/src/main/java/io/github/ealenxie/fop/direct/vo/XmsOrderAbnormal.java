package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/24 18:07
 */
@Getter
@Setter
public class XmsOrderAbnormal {


    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    @JsonProperty("abnormal_info")
    private List<AbnormalInfo> abnormalInfo;
    @JsonProperty("abnormal_type")
    private String abnormalType;
    @JsonProperty("consignment_status")
    private String consignmentStatus;
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    @JsonProperty("logistics_product_name")
    private String logisticsProductName;
    @JsonProperty("ref_no")
    private String refNo;
}
