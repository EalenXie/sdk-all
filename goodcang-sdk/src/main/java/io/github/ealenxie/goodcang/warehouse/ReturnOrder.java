package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 15:31
 */
@Getter
@Setter
public class ReturnOrder {
    /**
     * 退件单号
     */
    @JsonProperty("asro_code")
    private String asroCode;
    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 退件状态
     */
    @JsonProperty("asro_status")
    private Integer asroStatus;
    /**
     * 退件类型
     */
    @JsonProperty("cass_type")
    private Integer cassType;
    /**
     * 创建时间
     */
    @JsonProperty("asro_add_time")
    private String asroAddTime;
    /**
     * 审核时间
     */
    @JsonProperty("asro_audit_time")
    private String asroAuditTime;
    /**
     * 上架完成时间
     */
    @JsonProperty("asro_putaway_time")
    private String asroPutawayTime;
    /**
     * 退件收货仓库
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 派送方式
     */
    @JsonProperty("sm_type")
    private Integer smType;
    /**
     * 退件原因
     */
    @JsonProperty("asro_reason")
    private String asroReason;
    /**
     * 物流产品编码
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 计费长
     */
    @JsonProperty("as_length")
    private String asLength;
    /**
     * 计费宽
     */
    @JsonProperty("as_width")
    private String asWidth;
    /**
     * 计费高
     */
    @JsonProperty("as_height")
    private String asHeight;
    /**
     * 计费重
     */
    @JsonProperty("charge_weight")
    private String chargeWeight;
    /**
     * 客服留言
     */
    @JsonProperty("asro_note")
    private String asroNote;
    /**
     * 退件标识
     */
    @JsonProperty("return_identification")
    private Integer returnIdentification;
    /**
     * 退件产品明细
     */
    @JsonProperty("product_detail")
    private List<ReturnProductDetail> productDetail;
    /**
     * 费用明细
     */
    @JsonProperty("fee_details")
    private ReturnOrderFeeDetails feeDetails;
    /**
     * 集货区域仓编码
     */
    @JsonProperty("collect_warehouse_code")
    private String collectWarehouseCode;
    /**
     * 退货服务类型
     */
    @JsonProperty("service_type")
    private Integer serviceType;
    /**
     * 是否退回集货仓
     */
    @JsonProperty("is_transit")
    private Integer isTransit;


    @JsonProperty("validity_period_detail")
    private List<ValidityPeriodDetail> validityPeriodDetail;
}
