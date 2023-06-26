package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 10:07
 */
@Getter
@Setter
public class GrnInfo {


    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
    /**
     * 客户参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 服务方式(物流产品代码)
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 入库单状态
     */
    @JsonProperty("receiving_status")
    private Integer receivingStatus;
    /**
     * 入库单类型
     */
    @JsonProperty("transit_type")
    private Integer transitType;
    /**
     * 货运方式
     */
    @JsonProperty("receiving_shipping_type")
    private Integer receivingShippingType;
    /**
     * 创建日期
     */
    @JsonProperty("create_at")
    private String createAt;
    /**
     * 修改日期
     */
    @JsonProperty("update_at")
    private String updateAt;
    /**
     * 海外仓仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 国内中转仓库代码
     */
    @JsonProperty("transit_warehouse_code")
    private String transitWarehouseCode;
    /**
     * 海外仓入库端收货总箱数
     */
    @JsonProperty("overseas_box_total")
    private Integer overseasBoxTotal;
    /**
     * 海外目的仓收货总件数
     */
    @JsonProperty("overseas_sku_total")
    private Integer overseasSkuTotal;
    /**
     * 预报箱数
     */
    @JsonProperty("box_total_count")
    private Integer boxTotalCount;
    /**
     * 预报SKU件数
     */
    @JsonProperty("sku_total_count")
    private Integer skuTotalCount;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * 物理仓编码
     */
    @JsonProperty("wp_code")
    private String wpCode;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 报关资料上传状态
     */
    @JsonProperty("customs_docs_status")
    private Integer customsDocsStatus;
    /**
     * 是否仓库装箱商品
     */
    @JsonProperty("is_rollover")
    private Integer isRollover;
    /**
     * 最后中转运输轨迹状态名称
     */
    @JsonProperty("track_status")
    private String trackStatus;
}
