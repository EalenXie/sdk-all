package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/4/21 11:03
 * @version 1.0
 */
@Getter
@Setter
public class OutboundOrderInfoResponse {
    /**
     * WINIT跟踪号
     */
    @JsonProperty("winitTrackingNo")
    private String winitTrackingNo;
    /**
     * 邮政编码
     */
    @JsonProperty("zipCode")
    private String zipCode;
    /**
     * 出库时间
     */
    @JsonProperty("outboundDate")
    private String outboundDate;
    /**
     * 收件人电话
     */
    @JsonProperty("phoneNum")
    private String phoneNum;
    /**
     * 最后一公里派送方式ID
     */
    @JsonProperty("deliverywayId")
    private Integer deliverywayId;
    /**
     * 最后一公里派送方式所用保险类型(该字段已停用)
     */
    @JsonProperty("insuranceType")
    private String insuranceType;
    /**
     * 最后一公里派送方式所用保险类型ID(该字段已停用)
     */
    @JsonProperty("insuranceTypeID")
    private Integer insuranceTypeID;
    /**
     * Ebay上显示的快递公司名
     */
    @JsonProperty("ebayName")
    private String ebayName;
    @JsonProperty("isShareOrder")
    private String isShareOrder;
    /**
     * 收件人邮箱
     */
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("eBaySellerID")
    private String eBaySellerID;
    /**
     * 派送费用
     * 以海外仓当地币种结算
     */
    @JsonProperty("deliveryCosts")
    private String deliveryCosts;
    /**
     * 包裹计费重量
     * 单位：kg
     */
    @JsonProperty("chargeableWeight")
    private String chargeableWeight;
    /**
     * 海外仓出库单编号
     */
    @JsonProperty("outboundOrderNum")
    private String outboundOrderNum;
    /**
     * IOSS
     */
    @JsonProperty("iossNo")
    private String iossNo;
    /**
     * 收件人姓名
     */
    @JsonProperty("recipientName")
    private String recipientName;
    /**
     * 收件人国家,ISO国家二字码
     */
    @JsonProperty("state")
    private String state;
    /**
     * 卖家订单号是否重复
     */
    @JsonProperty("isRepeat")
    private String isRepeat;
    /**
     * 出库单创建时间(系统时间)
     */
    @JsonProperty("orderedTime")
    private String orderedTime;
    @JsonProperty("eBayItemID")
    private String eBayItemID;
    /**
     * 重量
     */
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * 返利
     */
    @JsonProperty("rebateFeeCosts")
    private String rebateFeeCosts;
    @JsonProperty("estimateVolume")
    private String estimateVolume;
    /**
     * 包裹列表
     */
    @JsonProperty("packageList")
    private List<OutboundPackageList> packageList;
    @JsonProperty("storageOntime")
    private String storageOntime;
    @JsonProperty("estimateWeight")
    private BigDecimal estimateWeight;
    @JsonProperty("volume")
    private BigDecimal volume;
    /*--------------以下字段与packageList重复---------*/
    /**
     * 计划完成时间
     */
    @JsonProperty("scheduledFinishTime")
    private String scheduledFinishTime;
    /**
     * 准时派送（服务时间、完成时间）
     */
    @JsonProperty("ontimeStatus")
    private String ontimeStatus;
    /**
     * 完成时间（天）
     */
    @JsonProperty("serviceCompleteTime")
    private String serviceCompleteTime;
    /**
     * 标准时间（天）
     */
    @JsonProperty("serviceStandardTime")
    private String serviceStandardTime;
    /*-----------------------------------------------*/
    /**
     * 最后一公里物流追踪号
     */
    @JsonProperty("trackingNum")
    private String trackingNum;
    /**
     * 订单处理费货币
     * 以海外仓当地币种结算
     */
    @JsonProperty("handlingfeeCode")
    private String handlingfeeCode;
    /**
     * 仓库ID
     */
    @JsonProperty("warehouseId")
    private String warehouseId;
    @JsonProperty("cToBpartnerId")
    private Integer cToBpartnerId;
    /**
     * ebay买家id
     */
    @JsonProperty("eBayBuyerID")
    private String eBayBuyerID;
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * 国家名称
     */
    @JsonProperty("countryName")
    private String countryName;
    /**
     * 总费用
     * 总费用=处理费+派送费+其它，
     * 单位为USD
     */
    @JsonProperty("totalCost")
    private BigDecimal totalCost;
    /**
     * 出库单状态
     */
    @JsonProperty("status")
    private String status;
    @JsonProperty("eBayNo")
    private String eBayNo;
    /**
     * 是否ebay返利
     */
    @JsonProperty("eBayValidateResult")
    private String eBayValidateResult;
    /**
     * 派送完成情况
     * 及时与否
     * OT:准时
     * DL:迟到
     */
    @JsonProperty("deliveryCompletionStatus")
    private String deliveryCompletionStatus;
    /**
     * 卖家订单号
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
    /**
     * 订单处理费
     * 以海外仓当地币种结算
     */
    @JsonProperty("handlingFee")
    private BigDecimal handlingFee;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 收件人州
     */
    @JsonProperty("regionName")
    private String regionName;
    @JsonProperty("cFromBpartnerId")
    private Integer cFromBpartnerId;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 货币单位对美元的汇率
     */
    @JsonProperty("rate")
    private String rate;
    /**
     * 出库单状态中文名
     */
    @JsonProperty("statusName")
    private String statusName;
    /**
     * 最后一公里派送方式
     */
    @JsonProperty("deliverywayName")
    private String deliverywayName;
    /**
     * 是否ebay订单
     */
    @JsonProperty("isEBayOrder")
    private String isEBayOrder;
    /**
     * 电商平台类型
     * ebay，Amazon，wish，tiktok， Other
     */
    @JsonProperty("storeType")
    private String storeType;
    /**
     * 出库单ID
     */
    @JsonProperty("outboundOrderID")
    private String outboundOrderID;
    /**
     * 收件人街道1
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * 收件人街道2
     */
    @JsonProperty("address2")
    private Object address2;
    /**
     * 派关费用编码
     * 派送费货币
     */
    @JsonProperty("deliveryCostsCode")
    private String deliveryCostsCode;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 商品数量
     */
    @JsonProperty("productNum")
    private Integer productNum;
    /**
     * 交易日期
     * 格式：YYYY-MM-DD HH:MM:SS
     */
    @JsonProperty("transactionDate")
    private String transactionDate;
    /**
     * 服务实际完成时间
     */
    @JsonProperty("actualFinishTime")
    private String actualFinishTime;
    /**
     * 派送公司名称
     */
    @JsonProperty("carrier")
    private String carrier;
    @JsonProperty("bpName")
    private String bpName;
    /**
     * 商品编码,sku
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * 返利币种
     */
    @JsonProperty("rebateFeeCostsCode")
    private String rebateFeeCostsCode;
    @JsonProperty("cBpartnerId")
    private Integer cBpartnerId;
    @JsonProperty("doorplateNumbers")
    private String doorplateNumbers;
    /**
     * eBay订单号
     */
    @JsonProperty("eBayOrderID")
    private String eBayOrderID;
}
