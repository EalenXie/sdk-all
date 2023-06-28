package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:15
 */
@Getter
@Setter
public class ConsignmentInfo {
    /**
     * 4PX收货时间（*注：时间格式的传入值需要转换为long类型格式。）
     */
    @JsonProperty("4px_inbound_date")
    private Long fpxInboundDate;

    /**
     * 4PX出库时间（*注：时间格式的传入值需要转换为long类型格式。）
     */
    @JsonProperty("4px_outbound_date")
    private Long fpxOutboundDate;

    /**
     * 4PX单号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * 创建委托单时间（*注：时间格式的传入值需要转换为long类型格式。）
     */
    @JsonProperty("consignment_create_date")
    private Long consignmentCreateDate;

    /**
     * 委托单状态（草稿：D；已预报：P；已交接/已交货：V；库内作业中：H；已出库：C；已关闭：X；)
     */
    @JsonProperty("consignment_status")
    private String consignmentStatus;

    /**
     * 客户委托单号
     */
    @JsonProperty("ds_consignment_no")
    private String dsConsignmentNo;

    /**
     * 是否进行ODA校验（Y：表示已经校验过；N：表示尚未校验）
     */
    @JsonProperty("has_check_oda")
    private String hasCheckOda;

    /**
     * 投保状态（Y 已投保；N 未投保）
     */
    @JsonProperty("insure_status")
    private String insureStatus;

    /**
     * 投保类型
     */
    @JsonProperty("insure_type")
    private String insureType;

    /**
     * 拦截标识（申请拦截：Y ；拦截成功：S； 放行：N ）
     */
    @JsonProperty("is_hold_sign")
    private String isHoldSign;

    /**
     * 末端服务商单号（(若此字段为空：①表示系统在异步取号中--再次查询即可获取；②取号失败--此时字段get_no_exmsg会返回相应的报错内容)）
     */
    @JsonProperty("logistics_channel_no")
    private String logisticsChannelNo;

    /**
     * 运输方式代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 运输方式名称
     */
    @JsonProperty("logistics_product_name")
    private String logisticsProductName;

    /**
     * ODA标识(偏远地址：Y ；非偏远地址：N)
     */
    @JsonProperty("oda_result_sign")
    private String odaResultSign;

    /**
     * 客户单号
     */
    @JsonProperty("ref_no")
    private String refNo;
}
