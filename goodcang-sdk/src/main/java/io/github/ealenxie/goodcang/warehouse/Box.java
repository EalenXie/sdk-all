package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 17:35
 */
@NoArgsConstructor
@Data
public class Box {
    /**
     * 箱唛号
     */
    @JsonProperty("box_no")
    private String boxNo;
    /**
     * 计划单号
     */
    @JsonProperty("plan_order_code")
    private String planOrderCode;
    /**
     * 关联单号
     */
    @JsonProperty("relation_order_code")
    private String relationOrderCode;
    /**
     * 区域仓
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 暂存费用总额
     */
    @JsonProperty("temp_total_amount")
    private String tempTotalAmount;
    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 换标服务
     */
    @JsonProperty("is_change_label")
    private Integer isChangeLabel;
    /**
     * 换标要求
     */
    @JsonProperty("label_replacement_option")
    private Integer labelReplacementOption;
    /**
     * 贴标服务
     */
    @JsonProperty("is_stick_label")
    private Integer isStickLabel;
    /**
     * 合规负责人编码
     */
    @JsonProperty("euro_terms_code")
    private String euroTermsCode;
    /**
     * 箱状态
     */
    @JsonProperty("box_status")
    private Integer boxStatus;
    /**
     * 长
     */
    @JsonProperty("length")
    private String length;
    /**
     * 宽
     */
    @JsonProperty("width")
    private String width;
    /**
     * 高
     */
    @JsonProperty("height")
    private String height;
    /**
     * 重量
     */
    @JsonProperty("weight")
    private String weight;
    /**
     * 装箱时间
     */
    @JsonProperty("pack_time")
    private String packTime;
    /**
     * 商品信息
     */
    @JsonProperty("sku_list")
    private List<PlanOrderSku> skuList;
}
