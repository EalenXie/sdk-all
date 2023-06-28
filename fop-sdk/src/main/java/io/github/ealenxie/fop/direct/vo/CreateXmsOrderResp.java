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
    /**
     * 直发委托单号
     */
    @JsonProperty("ds_consignment_no")
    private String dsConsignmentNo;

    /**
     * 4PX跟踪号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * @ deprecated   标签条码号。*注：参数为deprecated状态
     */
    @JsonProperty("label_barcode")
    private String labelBarcode;

    /**
     * 物流渠道名称
     */
    @JsonProperty("logistics_channel_name")
    private String logisticsChannelName;

    /**
     * 客户单号/客户参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 物流渠道号码。如果结果返回为空字符，表示暂时没有物流渠道号码，请稍后主动调用查询直发委托单接口查询
     */
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;
}
