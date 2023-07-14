package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/4/21 14:38
 * @version 1.0
 */
@Getter
@Setter
public class CreateLamOrderPayload {

    /**
     * 卖家订单号唯一
     */
    @JsonProperty("sellerOrderNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerOrderNo;
    /**
     * 预计发货日期 例：2019-03-11 12:12:12
     * 不能小于API推送时间
     */
    @JsonProperty("shipDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipDate;
    /**
     * 快递单号
     */
    @JsonProperty("trackingNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNo;
    /**
     * ebay订单号
     * ebay订单必填
     */
    @JsonProperty("ebayOrderId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ebayOrderId;
    /**
     * ebay卖家ID
     * ebay订单必填
     */
    @JsonProperty("ebaySellerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ebaySellerId;
    /**
     * ebay买家ID
     * ebay订单必填
     */
    @JsonProperty("ebayBuyerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ebayBuyerId;
    /**
     * 备注
     */
    @JsonProperty("shiperMemo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shiperMemo;
    /**
     * 总包裹数量
     */
    @JsonProperty("totalParcelsNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal totalParcelsNumber;
    /**
     * 总包裹重量
     */
    @JsonProperty("totalParcelsWeight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal totalParcelsWeight;
    /**
     * 产品信息
     */
    @JsonProperty("productInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ProductInfo productInfo;
    /**
     * 发货人信息
     */
    @JsonProperty("shipper")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Shipper shipper;
    /**
     * 收货人
     */
    @JsonProperty("receiver")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Receiver receiver;
    /**
     * 包裹列表
     */
    @JsonProperty("parcelList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ParcelList> parcelList;
}
