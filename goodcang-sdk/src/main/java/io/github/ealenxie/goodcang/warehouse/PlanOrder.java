package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 17:22
 */
@Getter
@Setter
public class PlanOrder {
    /**
     * 计划单号
     */
    @JsonProperty("plan_order_code")
    private String planOrderCode;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 区域仓
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 目的仓类型
     */
    @JsonProperty("dest_warehouse_type")
    private Integer destWarehouseType;
    /**
     * 换标要求
     */
    @JsonProperty("label_replacement_option")
    private Integer labelReplacementOption;
    /**
     * 换标服务
     */
    @JsonProperty("is_change_label")
    private Integer isChangeLabel;
    /**
     * 贴标服务
     */
    @JsonProperty("is_stick_label")
    private Integer isStickLabel;
    /**
     * 费用总额
     */
    @JsonProperty("actual_fee_estimate")
    private String actualFeeEstimate;
    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 商品信息
     */
    @JsonProperty("product_list")
    private List<PoProduct> productList;
    /**
     * 暂存箱信息
     */
    @JsonProperty("box_list")
    private List<PlanOrderBox> boxList;
    /**
     * 状态
     */
    @JsonProperty("order_status")
    private Integer orderStatus;
    /**
     * 异常原因
     */
    @JsonProperty("abnormal_reason")
    private String abnormalReason;
    /**
     * 创建时间
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * 更新时间
     */
    @JsonProperty("update_time")
    private String updateTime;
    /**
     * 提交时间
     */
    @JsonProperty("submit_time")
    private String submitTime;
    /**
     * 提交时间
     */
    @JsonProperty("finish_time")
    private String finishTime;
}
