package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.CurrencyAmountUnit;
import io.github.ealenxie.walmart.marketplace.fulfillment.Name;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class ReturnOrder {
    /**
     * returnOrderId
     */
    @JsonProperty("returnOrderId")
    private String returnOrderId;
    /**
     * customerEmailId
     */
    @JsonProperty("customerEmailId")
    private String customerEmailId;
    /**
     * customerName
     */
    @JsonProperty("customerName")
    private Name customerName;
    /**
     * customerOrderId
     */
    @JsonProperty("customerOrderId")
    private String customerOrderId;
    /**
     * refundMode
     */
    @JsonProperty("refundMode")
    private String refundMode;
    /**
     * returnOrderDate
     */
    @JsonProperty("returnOrderDate")
    private String returnOrderDate;
    /**
     * returnType
     */
    @JsonProperty("returnType")
    private String returnType;
    /**
     * replacementCustomerOrderId
     */
    @JsonProperty("replacementCustomerOrderId")
    private String replacementCustomerOrderId;
    /**
     * returnByDate
     */
    @JsonProperty("returnByDate")
    private String returnByDate;
    /**
     * totalRefundAmount
     */
    @JsonProperty("totalRefundAmount")
    private CurrencyAmountUnit totalRefundAmount;
    /**
     * returnLineGroups
     */
    @JsonProperty("returnLineGroups")
    private List<ReturnLineGroup> returnLineGroups;
    /**
     * returnOrderLines
     */
    @JsonProperty("returnOrderLines")
    private List<ReturnOrderLine> returnOrderLines;
    /**
     * returnChannel
     */
    @JsonProperty("returnChannel")
    private ReturnChannel returnChannel;
}
