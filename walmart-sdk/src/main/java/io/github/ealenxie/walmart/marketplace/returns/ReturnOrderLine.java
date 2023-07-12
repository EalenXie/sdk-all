package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.CurrencyAmountUnit;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class ReturnOrderLine {
    /**
     * returnOrderLineNumber
     */
    @JsonProperty("returnOrderLineNumber")
    private Integer returnOrderLineNumber;
    /**
     * salesOrderLineNumber
     */
    @JsonProperty("salesOrderLineNumber")
    private Integer salesOrderLineNumber;
    /**
     * returnReason
     */
    @JsonProperty("returnReason")
    private String returnReason;
    /**
     * purchaseOrderId
     */
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    /**
     * sellerOrderId
     */
    @JsonProperty("sellerOrderId")
    private String sellerOrderId;
    /**
     * purchaseOrderLineNumber
     */
    @JsonProperty("purchaseOrderLineNumber")
    private Integer purchaseOrderLineNumber;
    /**
     * isReturnForException
     */
    @JsonProperty("isReturnForException")
    private Boolean isReturnForException;
    /**
     * exceptionItemType
     */
    @JsonProperty("exceptionItemType")
    private String exceptionItemType;
    /**
     * rechargeReason
     */
    @JsonProperty("rechargeReason")
    private String rechargeReason;
    /**
     * returnCancellationReason
     */
    @JsonProperty("returnCancellationReason")
    private String returnCancellationReason;
    /**
     * item
     */
    @JsonProperty("item")
    private Item item;
    /**
     * charges
     */
    @JsonProperty("charges")
    private List<Charge> charges;
    /**
     * unitPrice
     */
    @JsonProperty("unitPrice")
    private CurrencyAmountUnit unitPrice;
    /**
     * chargeTotals
     */
    @JsonProperty("chargeTotals")
    private List<ChargeTotal> chargeTotals;
    /**
     * currentDeliveryStatus
     */
    @JsonProperty("currentDeliveryStatus")
    private String currentDeliveryStatus;
    /**
     * currentRefundStatus
     */
    @JsonProperty("currentRefundStatus")
    private String currentRefundStatus;
    /**
     * currentTrackingStatuses
     */
    @JsonProperty("currentTrackingStatuses")
    private List<CurrentTrackingStatus> currentTrackingStatuses;
    /**
     * refundChannels
     */
    @JsonProperty("refundChannels")
    private List<RefundChannel> refundChannels;
    /**
     * cancellableQty
     */
    @JsonProperty("cancellableQty")
    private Integer cancellableQty;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Qty quantity;
    /**
     * returnExpectedFlag
     */
    @JsonProperty("returnExpectedFlag")
    private Boolean returnExpectedFlag;
    /**
     * isFastReplacement
     */
    @JsonProperty("isFastReplacement")
    private Boolean isFastReplacement;
    /**
     * isKeepIt
     */
    @JsonProperty("isKeepIt")
    private Boolean isKeepIt;
    /**
     * lastItem
     */
    @JsonProperty("lastItem")
    private Boolean lastItem;
    /**
     * refundedQty
     */
    @JsonProperty("refundedQty")
    private Integer refundedQty;
    /**
     * rechargeableQty
     */
    @JsonProperty("rechargeableQty")
    private Integer rechargeableQty;
    /**
     * refundChannel
     */
    @JsonProperty("refundChannel")
    private String refundChannel;
    /**
     * returnTrackingDetail
     */
    @JsonProperty("returnTrackingDetail")
    private List<ReturnTrackingDetail> returnTrackingDetail;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * statusTime
     */
    @JsonProperty("statusTime")
    private String statusTime;
}
