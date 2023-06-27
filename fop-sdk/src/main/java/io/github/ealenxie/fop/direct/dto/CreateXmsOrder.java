package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/21 12:49
 */
@Getter
@Setter
public class CreateXmsOrder {

    /**
     * 4PX跟踪号（预分配号段的客户可传此值）
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    /**
     * 参考号（客户自有系统的单号，如客户单号）
     */
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 业务类型(4PX内部调度所需，如需对接传值将说明，默认值：BDS。)
     */
    @JsonProperty("business_type")
    private String businessType;
    /**
     * 税费费用承担方式(可选值：U、P); U：DDU由收件人支付关税; P：DDP 由寄件方支付关税 （如果物流产品只提供其中一种，则以4PX提供的为准）
     */
    @JsonProperty("duty_type")
    private String dutyType;
    /**
     * 货物类型（1：礼品;2：文件;3：商品货样;5：其它；默认值：5）
     */
    @JsonProperty("cargo_type")
    private String cargoType;
    /**
     * VAT税号(数字或字母)；欧盟国家(含英国)使用的增值税号
     */
    @JsonProperty("vat_no")
    private String vatNo;
    /**
     * EORI号码(数字或字母)；欧盟入关时需要EORI号码，用于商品货物的清关
     */
    @JsonProperty("eori_no")
    private String eoriNo;
    /**
     * 买家ID(数字或字母)
     */
    @JsonProperty("buyer_id")
    private String buyerId;
    /**
     * 销售平台（点击查看详情）
     */
    @JsonProperty("sales_platform")
    private String salesPlatform;
    /**
     * 卖家ID(数字或字母)
     */
    @JsonProperty("seller_id")
    private String sellerId;
    /**
     * 物流服务信息
     */
    @JsonProperty("logistics_service_info")
    private LogisticsServiceInfo logisticsServiceInfo;
    /**
     * 面单条码（预分配号段的客户可传此值）
     */
    @JsonProperty("label_barcode")
    private String labelBarcode;
    /**
     * 退件信息
     */
    @JsonProperty("return_info")
    private ReturnInfo returnInfo;
    /**
     * 包裹列表
     */
    @JsonProperty("parcel_list")
    private List<Parcel> parcelList;
    /**
     * 是否投保(Y、N)
     */
    @JsonProperty("is_insure")
    private String isInsure;
    /**
     * 保险信息（投保时必须填写）
     */
    @JsonProperty("insurance_info")
    private InsuranceInfo insuranceInfo;
    /**
     * 发件人信息
     */
    @JsonProperty("sender")
    private AddressInfo sender;
    /**
     * 收件人信息
     */
    @JsonProperty("recipient_info")
    private AddressInfo recipientInfo;
    /**
     * 货物到仓方式信息
     */
    @JsonProperty("deliver_type_info")
    private DeliverTypeInfo deliverTypeInfo;

    /**
     * 标签配置信息
     */
    @JsonProperty("label_config_info")
    private LabelConfigInfo labelConfigInfo;
}
