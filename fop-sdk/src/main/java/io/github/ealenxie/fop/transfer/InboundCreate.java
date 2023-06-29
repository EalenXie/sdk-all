package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 12:39
 */
@Getter
@Setter
public class InboundCreate {
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
     * 4PX跟踪号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 面单条码
     */
    @JsonProperty("labelBarcode")
    private String labelBarcode;

    /**
     * 业务类型(4PX内部调度所需，如需对接传值将说明，默认值：TRS。)
     */
    @JsonProperty("businessType")
    private String businessType;

    /**
     * 集货仓库代码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    @JsonProperty("dutyType")
    private String dutyType;

    /**
     * 货物类型（礼品：1;文件：2;商品货样:3;其它：4；默认值：4）
     */
    @JsonProperty("cargoType")
    private String cargoType;

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
     * 交易号ID(数字或字母)
     * <p>
     * 例如电商平台交易单号
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
     * 包裹申报价值（最多4位小数，多余的小数位会直接去除掉，只保留四位小数）
     */
    @JsonProperty("parcelValue")
    private Double parcelValue;

    /**
     * 币别（按照ISO标准三字码，目前只支持USD）
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
     * 增值服务
     */
    @JsonProperty("valueAddedServicesList")
    private List<ValueAddedService> valueAddedServiceList;

    /**
     * 商品列表
     * <p>
     * 国际：根据启运国-目的国的设定来确认传物品还是商品品类Code；本地无需填此项
     */
    @JsonProperty("productList")
    private List<Product> productList;

    /**
     * 收货方式方式信息
     */
    @JsonProperty("deliverTypeInfo")
    private DeliverTypeInfo deliverTypeInfo;

    /**
     * 退件信息
     */
    @JsonProperty("returnInfo")
    private ReturnInfo returnInfo;
}
