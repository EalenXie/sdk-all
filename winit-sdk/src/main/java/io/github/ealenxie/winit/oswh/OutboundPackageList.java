package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/4/21 11:03
 * @version 1.0
 */
@Getter
@Setter
public class OutboundPackageList {
    /**
     * 是否由万邑通作废
     */
    @JsonProperty("isOperateByWinit")
    private String isOperateByWinit;
    /**
     * 出库时间
     */
    @JsonProperty("outboundDate")
    private String outboundDate;
    /**
     * 跟踪号列表
     */
    @JsonProperty("trackingNos")
    private List<String> trackingNos;
    /**
     * 包裹重量kg
     */
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * 交易日期
     */
    @JsonProperty("transactionDate")
    private String transactionDate;
    /**
     * 实际完成的时间
     */
    @JsonProperty("actualFinishTime")
    private String actualFinishTime;
    /**
     * 计划完成时间
     */
    @JsonProperty("scheduledFinishTime")
    private String scheduledFinishTime;
    /**
     * 商品列表
     */
    @JsonProperty("merchandiseList")
    private List<MerchandiseList> merchandiseList;
    /**
     * 完成时间（天）
     */
    @JsonProperty("serviceCompleteTime")
    private Integer serviceCompleteTime;
    /**
     * 准时派送（服务时间、完成时间）
     */
    @JsonProperty("ontimeStatus")
    private String ontimeStatus;
    /**
     * 作废原因
     */
    @JsonProperty("reasonForVoid")
    private String reasonForVoid;
    /**
     * 标准时间（天）
     */
    @JsonProperty("serviceStandardTime")
    private String serviceStandardTime;
    /**
     * 包裹编号
     */
    @JsonProperty("packageNum")
    private String packageNum;
    /**
     * 订单状态编码
     */
    @JsonProperty("status")
    private String status;
}
