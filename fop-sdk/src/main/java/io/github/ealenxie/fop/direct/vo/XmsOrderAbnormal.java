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

    /**
     * 4PX单号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * 异常信息
     */
    @JsonProperty("abnormal_info")
    private List<AbnormalInfo> abnormalInfo;

    /**
     * 异常件类型（IW：仓内异常件；OW：仓外异常件）；
     */
    @JsonProperty("abnormal_type")
    private String abnormalType;

    /**
     * 委托单状态（已交接/已交货：V；库内作业中：H；已出库：C；）
     */
    @JsonProperty("consignment_status")
    private String consignmentStatus;

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
     * 物流产品名称
     */
    @JsonProperty("logistics_product_name")
    private String logisticsProductName;

    /**
     * 客户单号
     */
    @JsonProperty("ref_no")
    private String refNo;
}
