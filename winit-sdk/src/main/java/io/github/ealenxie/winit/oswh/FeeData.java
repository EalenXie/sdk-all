package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:28
 * @version 1.0
 */
@Getter
@Setter
public class FeeData {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * orgId
     */
    @JsonProperty("orgId")
    private String orgId;
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
     * orgName
     */
    @JsonProperty("orgName")
    private String orgName;
    /**
     * incomeSettlementNo
     */
    @JsonProperty("incomeSettlementNo")
    private String incomeSettlementNo;
    /**
     * settlementDate
     */
    @JsonProperty("settlementDate")
    private String settlementDate;
    /**
     * businessDocumentNo
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
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
     * dateAcct
     */
    @JsonProperty("dateAcct")
    private String dateAcct;
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
    private String weight;
    /**
     * volume
     */
    @JsonProperty("volume")
    private String volume;
    /**
     * volumeWeight
     */
    @JsonProperty("volumeWeight")
    private String volumeWeight;
    /**
     * chargeWeight
     */
    @JsonProperty("chargeWeight")
    private String chargeWeight;
    /**
     * sourceCurrency
     */
    @JsonProperty("sourceCurrency")
    private String sourceCurrency;
    /**
     * sourceTotalAmt
     */
    @JsonProperty("sourceTotalAmt")
    private String sourceTotalAmt;
    /**
     * acctCurrency
     */
    @JsonProperty("acctCurrency")
    private String acctCurrency;
    /**
     * acctTotalAmt
     */
    @JsonProperty("acctTotalAmt")
    private String acctTotalAmt;
    /**
     * isInvoice
     */
    @JsonProperty("isInvoice")
    private String isInvoice;
    /**
     * invoiceNo
     */
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    /**
     * invoiceDate
     */
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    /**
     * isReconciled
     */
    @JsonProperty("isReconciled")
    private String isReconciled;
    /**
     * isAdjust
     */
    @JsonProperty("isAdjust")
    private String isAdjust;
    /**
     * adjustNo
     */
    @JsonProperty("adjustNo")
    private String adjustNo;
    /**
     * isRebate
     */
    @JsonProperty("isRebate")
    private String isRebate;
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
    private String totalDeclarePrice;
    /**
     * itemCodeNum
     */
    @JsonProperty("itemCodeNum")
    private String itemCodeNum;
    /**
     * totalItemQty
     */
    @JsonProperty("totalItemQty")
    private String totalItemQty;
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
     * exchangeRate
     */
    @JsonProperty("exchangeRate")
    private String exchangeRate;
    /**
     * conversionTypeCode
     */
    @JsonProperty("conversionTypeCode")
    private String conversionTypeCode;
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
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * incomeSettlementLineVos
     */
    @JsonProperty("incomeSettlementLineVos")
    private List<IncomeSettlementLinePayload> incomeSettlementLineVos;
}
