package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:28
 * @version 1.0
 */
@Getter
@Setter
public class IncomeSettlementLinePayload {
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * orgId
     */
    @JsonProperty("orgId")
    private Integer orgId;
    /**
     * isDelete
     */
    @JsonProperty("isDelete")
    private String isDelete;
    /**
     * isActive
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * created
     */
    @JsonProperty("created")
    private String created;
    /**
     * createdby
     */
    @JsonProperty("createdby")
    private String createdby;
    /**
     * updated
     */
    @JsonProperty("updated")
    private String updated;
    /**
     * updatedby
     */
    @JsonProperty("updatedby")
    private String updatedby;
    /**
     * chargeCode
     */
    @JsonProperty("chargeCode")
    private String chargeCode;
    /**
     * chargeName
     */
    @JsonProperty("chargeName")
    private String chargeName;
    /**
     * documentNo
     */
    @JsonProperty("documentNo")
    private String documentNo;
    /**
     * businessDocumentNo
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
    /**
     * sourceAmt
     */
    @JsonProperty("sourceAmt")
    private Integer sourceAmt;
    /**
     * sourceCurrency
     */
    @JsonProperty("sourceCurrency")
    private String sourceCurrency;
    /**
     * acctAmt
     */
    @JsonProperty("acctAmt")
    private Integer acctAmt;
    /**
     * acctCurrency
     */
    @JsonProperty("acctCurrency")
    private String acctCurrency;
    /**
     * exchangeRate
     */
    @JsonProperty("exchangeRate")
    private Integer exchangeRate;
    /**
     * conversionTypeCode
     */
    @JsonProperty("conversionTypeCode")
    private String conversionTypeCode;
    /**
     * incomeSettlementId
     */
    @JsonProperty("incomeSettlementId")
    private Integer incomeSettlementId;
    /**
     * revenueAdjustLineId
     */
    @JsonProperty("revenueAdjustLineId")
    private String revenueAdjustLineId;
    /**
     * invoicelineId
     */
    @JsonProperty("invoicelineId")
    private Integer invoicelineId;
    /**
     * isFeeDeducation
     */
    @JsonProperty("isFeeDeducation")
    private String isFeeDeducation;
    /**
     * docType
     */
    @JsonProperty("docType")
    private String docType;
    /**
     * partnerCode
     */
    @JsonProperty("partnerCode")
    private String partnerCode;
    /**
     * dateAcct
     */
    @JsonProperty("dateAcct")
    private String dateAcct;
    /**
     * isAdjust
     */
    @JsonProperty("isAdjust")
    private String isAdjust;
    /**
     * isRebate
     */
    @JsonProperty("isRebate")
    private String isRebate;
    /**
     * chargeValue
     */
    @JsonProperty("chargeValue")
    private String chargeValue;
    /**
     * exchangeDate
     */
    @JsonProperty("exchangeDate")
    private String exchangeDate;
    /**
     * warehouse
     */
    @JsonProperty("warehouse")
    private String warehouse;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * productLine
     */
    @JsonProperty("productLine")
    private String productLine;
    /**
     * arrearsAmt
     */
    @JsonProperty("arrearsAmt")
    private String arrearsAmt;
    /**
     * isInvoice
     */
    @JsonProperty("isInvoice")
    private String isInvoice;
    /**
     * logisticsDist
     */
    @JsonProperty("logisticsDist")
    private String logisticsDist;
    /**
     * accountCurrency
     */
    @JsonProperty("accountCurrency")
    private String accountCurrency;
    /**
     * settlementAmount
     */
    @JsonProperty("settlementAmount")
    private String settlementAmount;
    /**
     * isUsedCoupon
     */
    @JsonProperty("isUsedCoupon")
    private String isUsedCoupon;
    /**
     * ispIsEbayRebate
     */
    @JsonProperty("ispIsEbayRebate")
    private String ispIsEbayRebate;
    /**
     * isConformGift
     */
    @JsonProperty("isConformGift")
    private String isConformGift;
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * qty
     */
    @JsonProperty("qty")
    private Integer qty;
    /**
     * transactionType
     */
    @JsonProperty("transactionType")
    private String transactionType;
    /**
     * priceVersion
     */
    @JsonProperty("priceVersion")
    private String priceVersion;
    /**
     * partnerName
     */
    @JsonProperty("partnerName")
    private String partnerName;
    /**
     * orderDate
     */
    @JsonProperty("orderDate")
    private String orderDate;
    /**
     * originatingWarehouse
     */
    @JsonProperty("originatingWarehouse")
    private String originatingWarehouse;
    /**
     * destinationWarehouse
     */
    @JsonProperty("destinationWarehouse")
    private String destinationWarehouse;
    /**
     * transType
     */
    @JsonProperty("transType")
    private String transType;
    /**
     * weight
     */
    @JsonProperty("weight")
    private Integer weight;
    /**
     * volume
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * volumeWeight
     */
    @JsonProperty("volumeWeight")
    private String volumeWeight;
    /**
     * chargeWeight
     */
    @JsonProperty("chargeWeight")
    private Integer chargeWeight;
    /**
     * deliveryDate
     */
    @JsonProperty("deliveryDate")
    private String deliveryDate;
    /**
     * stockDate
     */
    @JsonProperty("stockDate")
    private String stockDate;
    /**
     * totalDeclarePrice
     */
    @JsonProperty("totalDeclarePrice")
    private Integer totalDeclarePrice;
    /**
     * itemCodeNum
     */
    @JsonProperty("itemCodeNum")
    private String itemCodeNum;
    /**
     * totalItemQty
     */
    @JsonProperty("totalItemQty")
    private Integer totalItemQty;
    /**
     * fistLegPrice
     */
    @JsonProperty("fistLegPrice")
    private String fistLegPrice;
    /**
     * sellerNo
     */
    @JsonProperty("sellerNo")
    private String sellerNo;
    /**
     * sellerId
     */
    @JsonProperty("sellerId")
    private String sellerId;
    /**
     * buyerId
     */
    @JsonProperty("buyerId")
    private String buyerId;
    /**
     * buyerCountry
     */
    @JsonProperty("buyerCountry")
    private String buyerCountry;
    /**
     * declareWeight
     */
    @JsonProperty("declareWeight")
    private String declareWeight;
    /**
     * mainDocumentNo
     */
    @JsonProperty("mainDocumentNo")
    private String mainDocumentNo;
    /**
     * onwardVoyageType
     */
    @JsonProperty("onwardVoyageType")
    private String onwardVoyageType;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * postalCode
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * firstDateAdded
     */
    @JsonProperty("firstDateAdded")
    private String firstDateAdded;
    /**
     * ascanDate
     */
    @JsonProperty("ascanDate")
    private String ascanDate;
    /**
     * warehouseEntryType
     */
    @JsonProperty("warehouseEntryType")
    private String warehouseEntryType;
    /**
     * wide
     */
    @JsonProperty("wide")
    private String wide;
    /**
     * high
     */
    @JsonProperty("high")
    private String high;
    /**
     * lenth
     */
    @JsonProperty("lenth")
    private String lenth;
    /**
     * masterBillNumber
     */
    @JsonProperty("masterBillNumber")
    private String masterBillNumber;
    /**
     * conversionRate
     */
    @JsonProperty("conversionRate")
    private String conversionRate;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * entryWhType
     */
    @JsonProperty("entryWhType")
    private String entryWhType;
}
