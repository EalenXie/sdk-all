package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/20 17:16
 * @version 1.0
 */
@Getter
@Setter
public class QueryOutboundOrderPayload extends OutboundOrderNumPayload {

    /**
     * 海外仓仓库Id
     */
    @JsonProperty("warehouseId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseId;
    /**
     * 卖家订单号（自定义）
     */
    @JsonProperty("sellerOrderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerOrderNo;
    /**
     * 快递单号
     */
    @JsonProperty("trackingNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNo;
    /**
     * 收件人姓名
     */
    @JsonProperty("receiverName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverName;
    /**
     * winit客户名称
     */
    @JsonProperty("bookingOperator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String bookingOperator;
    /**
     * 产品编码
     */
    @JsonProperty("productValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productValue;
    /**
     * 产品名称
     */
    @JsonProperty("productName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productName;
    /**
     * 商品SKU
     */
    @JsonProperty("productSku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productSku;
    /**
     * 是否共享订单（已停用）
     * 0：不包含共享信息 1：包含共享信息 2：共享方 3：被共享方 [默认为0]
     */
    @JsonProperty("shareOrderType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shareOrderType;
    /**
     * yyyy-MM-dd 出库单提交时间
     */
    @JsonProperty("dateOrderedStartDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dateOrderedStartDate;
    /**
     * yyyy-MM-dd 出库单提交时间
     */
    @JsonProperty("dateOrderedEndDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dateOrderedEndDate;
    /**
     * 订单状态编码
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    /**
     * 每页显示数量
     */
    @JsonProperty("pageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize = 100;
    /**
     * 页码，默认1
     */
    @JsonProperty("pageNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNum = 1;
}
