package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 9:38
 */
@Getter
@Setter
public class ModifyGrnPayload {

    /**
     * 入库单单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;

    /**
     * 入库单类型
     */
    @JsonProperty("transit_type")
    private Integer transitType;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 运输方式
     */
    @JsonProperty("receiving_shipping_type")
    private Integer receivingShippingType;
    /**
     * 跟踪号/海柜号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * 海外仓仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 预计到达时间
     */
    @JsonProperty("eta_date")
    private String etaDate;
    /**
     * 是否审核值
     */
    @JsonProperty("verify")
    private Integer verify;
    /**
     * 备注
     */
    @JsonProperty("receiving_desc")
    private String receivingDesc;
    /**
     * 入库单发货地址
     */
    @JsonProperty("shiper_address")
    private ShiperAddress shiperAddress;
    /**
     * 进口商编码
     */
    @JsonProperty("import_company")
    private Integer importCompany;
    /**
     * 入库单明细
     */
    @JsonProperty("items")
    private List<BoxItem> items;
    /**
     * 中转仓仓库编码
     */
    @JsonProperty("transit_warehouse_code")
    private String transitWarehouseCode;
    /**
     * 物流产品
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 报关方式
     */
    @JsonProperty("customs_type")
    private Integer customsType;
    /**
     * 揽收服务
     */
    @JsonProperty("collecting_service")
    private Integer collectingService;
    /**
     * 揽收资料
     */
    @JsonProperty("collecting_address")
    private List<CollectingAddress> collectingAddress;
    /**
     * 客户自送信息
     */
    @JsonProperty("customers_send_info")
    private CustomersSendInfo customersSendInfo;
    /**
     * 揽收时间
     */
    @JsonProperty("collecting_time")
    private String collectingTime;
    /**
     * 车型
     */
    @JsonProperty("car_model_code")
    private String carModelCode;
    /**
     * 重量
     */
    @JsonProperty("weight")
    private Integer weight;
    /**
     * 体积
     */
    @JsonProperty("volume")
    private Integer volume;
    /**
     * 是否自有税号清关
     */
    @JsonProperty("clearance_service")
    private Integer clearanceService;
    /**
     * 出口商编码
     */
    @JsonProperty("export_company")
    private Integer exportCompany;
    /**
     * 物理仓仓库代码
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
}
