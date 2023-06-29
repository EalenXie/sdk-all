package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/16 10:13
 */
@Getter
@Setter
public class OrderFreight {

    /**
     * 4PX单号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    /**
     * 客户单号
     */
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 服务商单号
     */
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;
    /**
     * 计费重
     */
    @JsonProperty("charge_weight")
    private String chargeWeight;
    /**
     * 计费时间
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 费用项列表
     */
    @JsonProperty("subs")
    private List<Subs> subs;
    /**
     * 总费用
     */
    @JsonProperty("total_fee")
    private String totalFee;
}
