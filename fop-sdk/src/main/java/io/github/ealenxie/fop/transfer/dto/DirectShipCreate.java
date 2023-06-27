package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 20:17
 */
@Getter
@Setter
public class DirectShipCreate {

    /**
     * 请求流水号唯一ID(方便跟踪请求日志)
     */
    @JsonProperty("serialNo")
    private String serialNo;

    /**
     * 参考号（客户自有系统的单号，如客户单号）
     */
    @JsonProperty("refNo")
    private String refNo;

    /**
     * 请求委托状态
     * <p>
     * PREALERT--标识正常预报
     * <p>
     * NON_PREALERT--标识无预报
     * <p>
     * 默认：PREALERT
     */
    @JsonProperty("status")
    private String status;

    /**
     * 4PX跟踪号,无预报确认时必须
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 包裹面单条码
     */
    @JsonProperty("labelBarcode")
    private String labelBarcode;

    /**
     * 业务类型(4PX内部调度所需，如需对接传值将说明，默认值：TRS)
     */
    @JsonProperty("businessType")
    private String businessType;

    /**
     * 税费费用承担方式(DDU,DDP)
     */
    @JsonProperty("dutyType")
    private String dutyType;

    /**
     * 货物类型（礼品：1;文件：2;商品货样:3;其它：4）
     * <p>
     * 默认值：4
     */
    @JsonProperty("cargoType")
    private String cargoType;

    /**
     * 启运仓库代码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;

    /**
     * 目的地国家地区二字码
     */
    @JsonProperty("destinationCountry")
    private String destinationCountry;

    /**
     * 买家ID(数字或字母)
     */
    @JsonProperty("buyerId")
    private String buyerId;

    /**
     * 销售平台
     */
    @JsonProperty("salesPlatform")
    private String salesPlatform;

    /**
     * 交易号ID(数字或字母),例如电商平台交易单号
     */
    @JsonProperty("tradeId")
    private String tradeId;

    /**
     * 卖家ID(数字或字母)
     */
    @JsonProperty("sellerId")
    private String sellerId;

    /**
     * 预报重量（g）
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 包裹长（cm）
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 包裹宽（cm）
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 包裹高（cm）
     */
    @JsonProperty("height")
    private Integer height;

    /**
     * 包裹申报价值（最多4位小数）
     */
    @JsonProperty("parcelValue")
    private Double parcelValue;

    /**
     * 币别（按照ISO标准三字码，例如：USD）
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 是否含电池, 1-带电 2-不带电
     */
    @JsonProperty("includeBattery")
    private String includeBattery;

    /**
     * 带电类型（内置电池PI966：966；配套电池PI967:967）
     */
    @JsonProperty("batteryType")
    private String batteryType;

    /**
     * 商品列表（国际：根据启运国-目的国的设定来确认传物品还是商品品类Code；）
     */
    @JsonProperty("productList")
    private List<Product> productList;

    /**
     * 收货方式方式信息
     */
    @JsonProperty("deliverTypeInfo")
    private DeliverTypeInfo deliverTypeInfo;

    /**
     * 物流服务信息
     */
    @JsonProperty("logisticsServiceInfo")
    private LogisticsServiceInfo logisticsServiceInfo;

    /**
     * 是否投保(Y、N)
     */
    @JsonProperty("isInsure")
    private String isInsure;

    /**
     * 投保信息（投保时必须填写）
     */
    @JsonProperty("insuranceInfo")
    private InsuranceInfo insuranceInfo;

    /**
     * 发件人信息
     */
    @JsonProperty("sender")
    private Sender sender;

    /**
     * 收件人信息
     */
    @JsonProperty("recipientInfo")
    private RecipientInfo recipientInfo;

    /**
     * 投递信息
     */
    @JsonProperty("deliverToRecipientInfo")
    private DeliverToRecipientInfo deliverToRecipientInfo;

    /**
     * 退件信息
     */
    @JsonProperty("returnInfo")
    private ReturnInfo returnInfo;
}
