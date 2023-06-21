package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author create by sch  2023/4/20 17:24
 * @version 1.0
 */
@Getter
@Setter
public class OutboundOrderVO {
    /**
     * 出库单ID
     */
    @JsonProperty("exwarehouseId")
    private String exwarehouseId;
    /**
     * 准时派送（服务时间、完成时间）
     */
    @JsonProperty("ontimeStatus")
    private String ontimeStatus;
    /**
     * 服务时间（天）
     */
    @JsonProperty("storageOntime")
    private String storageOntime;
    /**
     * 标准时间（天）
     */
    @JsonProperty("serviceStandardTime")
    private String serviceStandardTime;
    /**
     * 完成时间（天）
     */
    @JsonProperty("serviceCompleteTime")
    private String serviceCompleteTime;
    /**
     * 商品编码SKU
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 单品数量
     */
    @JsonProperty("itemqty")
    private Integer itemqty;
    /**
     * 重量（kg）
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * 国家
     */
    @JsonProperty("countryName")
    private String countryName;
    /**
     * 海外仓出库单号
     */
    @JsonProperty("documentNo")
    private String documentNo;
    /**
     * eBaySellerID
     */
    @JsonProperty("eBaySellerID")
    private String eBaySellerID;
    /**
     * 订单状态编码
     */
    @JsonProperty("status")
    private String status;
    /**
     * 卖家订单号
     */
    @JsonProperty("sellerOrderNo")
    private String sellerOrderNo;
    /**
     * 出库单状态中文名
     */
    @JsonProperty("statusName")
    private String statusName;
    /**
     * 仓库ID
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;
    /**
     * 仓库名
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 发货方式ID
     */
    @JsonProperty("deliverywayId")
    private Integer deliverywayId;
    /**
     * 发货方式
     */
    @JsonProperty("deliverywayName")
    private String deliverywayName;
    /**
     * 快递单号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * 收件人姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 下单人
     */
    @JsonProperty("bpName")
    private String bpName;
    /**
     * 下单时间
     */
    @JsonProperty("dateOrdered")
    private Date dateOrdered;
    /**
     * 出库时间
     */
    @JsonProperty("dateFinish")
    private Date dateFinish;
    /**
     * 是否为代销出库单
     */
    @JsonProperty("isShareOrder")
    private String isShareOrder;
    @JsonProperty("winitTrackingNo")
    private String winitTrackingNo;
    @JsonProperty("serviceNormDay")
    private String serviceNormDay;
    /**
     * 共享方ID
     */
    @JsonProperty("cFromBpartnerId")
    private Integer cFromBpartnerId;
    @JsonProperty("isAddressError")
    private String isAddressError;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("is_ebay_plus")
    private String isEbayPlus;
    /**
     * 是否允许重复
     */
    @JsonProperty("isRepeat")
    private String isRepeat;
    @JsonProperty("serviceCompletionDay")
    private String serviceCompletionDay;
    /**
     * 是否ebay订单
     */
    @JsonProperty("isEBayOrder")
    private String isEBayOrder;
    @JsonProperty("estimateFees")
    private Double estimateFees;
    /**
     * 卖方重量
     */
    @JsonProperty("sellerWeight")
    private Double sellerWeight;
    @JsonProperty("estimateVolume")
    private Double estimateVolume;
    /**
     * 包裹列表
     */
    @JsonProperty("packageList")
    private List<Package> packageList;
    /**
     * 错误信息
     */
    @JsonProperty("errorMsg")
    private String errorMsg;
    @JsonProperty("estimateWeight")
    private Double estimateWeight;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("ontimeTrack")
    private String ontimeTrack;
    /**
     * 代销商ID
     */
    @JsonProperty("cToBpartnerId")
    private String cToBpartnerId;
    @JsonProperty("finishedTime")
    private String finishedTime;
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * 邮编
     */
    @JsonProperty("postal")
    private String postal;
    /**
     * 业务伙伴
     */
    @JsonProperty("cBpartnerId")
    private String cBpartnerId;
}
