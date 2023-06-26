package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:03
 */
@Getter
@Setter
public class ReturnOrderUnauthorized {
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
     * 派送方式
     */
    @JsonProperty("sm_type")
    private Integer smType;
    /**
     * 集货仓库代码
     */
    @JsonProperty("collect_warehouse_code")
    private String collectWarehouseCode;
    /**
     * 确认状态
     */
    @JsonProperty("confirm_status")
    private Integer confirmStatus;
    /**
     * 退件类型
     */
    @JsonProperty("cass_type")
    private String cassType;
    /**
     * 退件收货仓库
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 物流产品编码
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 收货数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 客户商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 售后码
     */
    @JsonProperty("pas_code")
    private String pasCode;
    /**
     * 商品图片URL列表
     */
    @JsonProperty("photos")
    private java.util.List<String> photos;
    /**
     * 退件问题
     */
    @JsonProperty("asro_problem_content")
    private String asroProblemContent;
    /**
     * 收货日期
     */
    @JsonProperty("received_time")
    private String receivedTime;
}
