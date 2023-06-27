package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 10:22
 */
@Getter
@Setter
public class OrderInfo {
    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 销售平台
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 是否退件
     */
    @JsonProperty("is_return")
    private Integer isReturn;
    /**
     * 物流方式名称
     */
    @JsonProperty("sm_name")
    private String smName;
    /**
     * 订单状态文本
     */
    @JsonProperty("order_status_text")
    private String orderStatusText;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * 订单来源文本
     */
    @JsonProperty("create_type_text")
    private String createTypeText;
    /**
     * 发货仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * FBA发货仓库编码
     */
    @JsonProperty("fba_shipment_id")
    private String fbaShipmentId;
    /**
     * 实际重
     */
    @JsonProperty("real_weight")
    private String realWeight;
    /**
     * 实际尺寸
     */
    @JsonProperty("real_length")
    private String realLength;
}
