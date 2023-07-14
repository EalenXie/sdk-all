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
    private Object id;
    /**
     * orgId
     */
    @JsonProperty("orgId")
    private Object orgId;
    /**
     * isDelete
     */
    @JsonProperty("isDelete")
    private Object isDelete;
    /**
     * isActive
     */
    @JsonProperty("isActive")
    private Object isActive;
    /**
     * created
     */
    @JsonProperty("created")
    private Object created;
    /**
     * createdby
     */
    @JsonProperty("createdby")
    private Object createdby;
    /**
     * updated
     */
    @JsonProperty("updated")
    private Object updated;
    /**
     * updatedby
     */
    @JsonProperty("updatedby")
    private Object updatedby;
    /**
     * orgName
     */
    @JsonProperty("orgName")
    private Object orgName;
    /**
     * incomeSettlementNo
     */
    @JsonProperty("incomeSettlementNo")
    private Object incomeSettlementNo;
    /**
     * settlementDate
     */
    @JsonProperty("settlementDate")
    private Object settlementDate;
    /**
     * businessDocumentNo
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
    /**
     * docType
     */
    @JsonProperty("docType")
    private Object docType;
    /**
     * partnerCode
     */
    @JsonProperty("partnerCode")
    private Object partnerCode;
    /**
     * partnerName
     */
    @JsonProperty("partnerName")
    private Object partnerName;
    /**
     * orderDate
     */
    @JsonProperty("orderDate")
    private Object orderDate;
    /**
     * dateAcct
     */
    @JsonProperty("dateAcct")
    private Object dateAcct;
    /**
     * originatingWarehouse
     */
    @JsonProperty("originatingWarehouse")
    private Object originatingWarehouse;
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
    private Object weight;
    /**
     * volume
     */
    @JsonProperty("volume")
    private Object volume;
    /**
     * volumeWeight
     */
    @JsonProperty("volumeWeight")
    private Object volumeWeight;
    /**
     * chargeWeight
     */
    @JsonProperty("chargeWeight")
    private Object chargeWeight;
    /**
     * sourceCurrency
     */
    @JsonProperty("sourceCurrency")
    private Object sourceCurrency;
    /**
     * sourceTotalAmt
     */
    @JsonProperty("sourceTotalAmt")
    private Object sourceTotalAmt;
    /**
     * acctCurrency
     */
    @JsonProperty("acctCurrency")
    private Object acctCurrency;
    /**
     * acctTotalAmt
     */
    @JsonProperty("acctTotalAmt")
    private Object acctTotalAmt;
    /**
     * isInvoice
     */
    @JsonProperty("isInvoice")
    private Object isInvoice;
    /**
     * invoiceNo
     */
    @JsonProperty("invoiceNo")
    private Object invoiceNo;
    /**
     * invoiceDate
     */
    @JsonProperty("invoiceDate")
    private Object invoiceDate;
    /**
     * isReconciled
     */
    @JsonProperty("isReconciled")
    private Object isReconciled;
    /**
     * isAdjust
     */
    @JsonProperty("isAdjust")
    private Object isAdjust;
    /**
     * adjustNo
     */
    @JsonProperty("adjustNo")
    private Object adjustNo;
    /**
     * isRebate
     */
    @JsonProperty("isRebate")
    private Object isRebate;
    /**
     * deliveryDate
     */
    @JsonProperty("deliveryDate")
    private Object deliveryDate;
    /**
     * stockDate
     */
    @JsonProperty("stockDate")
    private Object stockDate;
    /**
     * totalDeclarePrice
     */
    @JsonProperty("totalDeclarePrice")
    private Object totalDeclarePrice;
    /**
     * itemCodeNum
     */
    @JsonProperty("itemCodeNum")
    private Object itemCodeNum;
    /**
     * totalItemQty
     */
    @JsonProperty("totalItemQty")
    private Object totalItemQty;
    /**
     * fistLegPrice
     */
    @JsonProperty("fistLegPrice")
    private Object fistLegPrice;
    /**
     * sellerNo
     */
    @JsonProperty("sellerNo")
    private String sellerNo;
    /**
     * sellerId
     */
    @JsonProperty("sellerId")
    private Object sellerId;
    /**
     * buyerId
     */
    @JsonProperty("buyerId")
    private Object buyerId;
    /**
     * buyerCountry
     */
    @JsonProperty("buyerCountry")
    private Object buyerCountry;
    /**
     * declareWeight
     */
    @JsonProperty("declareWeight")
    private Object declareWeight;
    /**
     * mainDocumentNo
     */
    @JsonProperty("mainDocumentNo")
    private Object mainDocumentNo;
    /**
     * onwardVoyageType
     */
    @JsonProperty("onwardVoyageType")
    private Object onwardVoyageType;
    /**
     * unit
     */
    @JsonProperty("unit")
    private Object unit;
    /**
     * exchangeRate
     */
    @JsonProperty("exchangeRate")
    private Object exchangeRate;
    /**
     * conversionTypeCode
     */
    @JsonProperty("conversionTypeCode")
    private Object conversionTypeCode;
    /**
     * postalCode
     */
    @JsonProperty("postalCode")
    private Object postalCode;
    /**
     * firstDateAdded
     */
    @JsonProperty("firstDateAdded")
    private Object firstDateAdded;
    /**
     * wide
     */
    @JsonProperty("wide")
    private Object wide;
    /**
     * high
     */
    @JsonProperty("high")
    private Object high;
    /**
     * lenth
     */
    @JsonProperty("lenth")
    private Object lenth;
    /**
     * masterBillNumber
     */
    @JsonProperty("masterBillNumber")
    private Object masterBillNumber;
    /**
     * conversionRate
     */
    @JsonProperty("conversionRate")
    private Object conversionRate;
    /**
     * ascanDate
     */
    @JsonProperty("ascanDate")
    private Object ascanDate;
    /**
     * warehouseEntryType
     */
    @JsonProperty("warehouseEntryType")
    private Object warehouseEntryType;
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private Object productCode;
    /**
     * productName
     */
    @JsonProperty("productName")
    private Object productName;
    /**
     * incomeSettlementLineVos
     */
    @JsonProperty("incomeSettlementLineVos")
    private List<IncomeSettlementLinePayload> incomeSettlementLineVos;
}
