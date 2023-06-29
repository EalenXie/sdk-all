package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 14:28
 */
@Getter
@Setter
public class ExternalCreate {
    /**
     * 客户订单参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 出库仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 税费费用承担方式(可选值：U、P);
     * <p>
     * <p>
     * U：DDU由收件人支付关税;
     * <p>
     * P：DDP 由寄件方支付关税 （如果物流产品只提供其中一种，则以4PX提供的为准）
     */
    @JsonProperty("duty_type")
    private String dutyType;

    /**
     * 货物类型（1：礼品;2：文件;3：商品货样;5：其它；默认值：5）
     */
    @JsonProperty("cargo_type")
    private String cargoType;

    /**
     * 销售平台（参考下方销售平台字典表），特殊渠道要求时必填
     */
    @JsonProperty("sales_platform")
    private String salesPlatform;

    /**
     * 10位日期时间戳，根据渠道要求是否必填
     */
    @JsonProperty("delivery_date")
    private String deliveryDate;

    /**
     * 交货时间段
     */
    @JsonProperty("delivery_timeslot")
    private String deliveryTimeslot;

    /**
     * 分区代码
     */
    @JsonProperty("partition_code")
    private String partitionCode;

    /**
     * 路线代码
     */
    @JsonProperty("route_code")
    private String routeCode;

    /**
     * 扩展字段
     */
    @JsonProperty("extend_field")
    private String extendField;

    /**
     * 物流产品信息
     */
    @JsonProperty("logistics_service_info")
    private LogisticsServiceInfo logisticsServiceInfo;

    /**
     * 收件人信息
     */
    @JsonProperty("consignee_info")
    private ConsigneeInfo consigneeInfo;

    /**
     * 发件人信息
     */
    @JsonProperty("shipper")
    private Shipper shipper;

    /**
     * 提货人信息
     */
    @JsonProperty("pickup")
    private Shipper pickup;

    /**
     * 包裹信息，如未能提供包裹尺寸、重量等信息时，将使用SKU尺寸、重量进行计算得出，建议根据实际情况填写
     */
    @JsonProperty("parcel_desc")
    private List<ParcelDesc> parcelDesc;

    /**
     * SKU信息
     */
    @JsonProperty("sku_list")
    private List<ExternalSku> skuList;
}
