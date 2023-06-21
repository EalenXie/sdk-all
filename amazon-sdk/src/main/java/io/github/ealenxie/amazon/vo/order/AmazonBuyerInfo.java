package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/2/22 15:39
 */
@Getter
@Setter
public class AmazonBuyerInfo {

    /**
     * 亚马逊订单id
     */
    @JsonProperty("AmazonOrderId")
    private String amazonOrderId;
    /**
     * 卖家的电子邮件地址
     */
    @JsonProperty("BuyerEmail")
    private String buyerEmail;
    /**
     * 买家名称
     */
    @JsonProperty("BuyerName")
    private String buyerName;
    /**
     * 买家国籍
     */
    @JsonProperty("BuyerCounty")
    private String buyerCounty;
    /**
     * 买家的税务信息
     */
    @JsonProperty("BuyerTaxInfo")
    private BuyerTaxInfo buyerTaxInfo;
    /**
     * 采购订单(PO)编号
     */
    @JsonProperty("PurchaseOrderNumber")
    private String purchaseOrderNumber;
}
