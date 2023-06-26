package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 10:16
 */
@Getter
@Setter
public class GrnDetail {


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
     * 入库单类型
     */
    @JsonProperty("transit_type")
    private Integer transitType;
    /**
     * FMS服务方式
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 预报重量
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * 预报体积
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * 备注
     */
    @JsonProperty("receiving_desc")
    private String receivingDesc;
    /**
     * 入库单状态
     */
    @JsonProperty("receiving_status")
    private Integer receivingStatus;
    /**
     * 货运方式
     */
    @JsonProperty("receiving_shipping_type")
    private Integer receivingShippingType;
    /**
     * 创建时间
     */
    @JsonProperty("create_at")
    private String createAt;
    /**
     * 异动时间
     */
    @JsonProperty("update_at")
    private String updateAt;
    /**
     * 海外目的仓仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 中转仓仓库编码
     */
    @JsonProperty("transit_warehouse_code")
    private String transitWarehouseCode;
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
     * 报关项
     */
    @JsonProperty("customs_type")
    private Integer customsType;
    /**
     * 是否自有税号清关
     */
    @JsonProperty("clearance_service")
    private Integer clearanceService;
    /**
     * 出口商id
     */
    @JsonProperty("export_company")
    private Integer exportCompany;
    /**
     * 进口商id
     */
    @JsonProperty("import_company")
    private Integer importCompany;
    /**
     * 揽收服务
     */
    @JsonProperty("collecting_service")
    private Integer collectingService;
    /**
     * 中转仓收货总箱数
     */
    @JsonProperty("transit_box_total")
    private Integer transitBoxTotal;
    /**
     * 揽收资料
     */
    @JsonProperty("collecting_address")
    private List<CollectingAddress> collectingAddress;
    /**
     * 预计到达时间
     */
    @JsonProperty("eta_date")
    private String etaDate;
    /**
     * 上架时间
     */
    @JsonProperty("gc_putaway_time")
    private String gcPutawayTime;
    /**
     * 中转入库明细
     */
    @JsonProperty("transfer_detail")
    private List<TransferDetail> transferDetail;
    /**
     * 海外仓入库明细
     */
    @JsonProperty("overseas_detail")
    private List<OverseasDetail> overseasDetail;
    /**
     * 物理仓仓库编码
     */
    @JsonProperty("wp_code")
    private String wpCode;
    /**
     * 是否递延
     */
    @JsonProperty("is_delay")
    private Integer isDelay;
    /**
     * 是否仓库装箱商品
     */
    @JsonProperty("is_rollover")
    private Integer isRollover;
    /**
     * 订舱单号
     */
    @JsonProperty("booking_cabin_no")
    private String bookingCabinNo;
    /**
     * 退税资料url
     */
    @JsonProperty("tax_rebate_data_url")
    private String taxRebateDataUrl;
    /**
     * 客户自送信息
     */
    @JsonProperty("customers_send_info")
    private CustomersSendInfo customersSendInfo;
}
