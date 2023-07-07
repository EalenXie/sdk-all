package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@NoArgsConstructor
@Data
public class AccountSummary {
    /**
     * openingBalance
     */
    @JsonProperty("openingBalance")
    private BigDecimal openingBalance;
    /**
     * orderActivity
     */
    @JsonProperty("orderActivity")
    private BigDecimal orderActivity;
    /**
     * walmartFulfillmentServices
     */
    @JsonProperty("walmartFulfillmentServices")
    private Double walmartFulfillmentServices;
    /**
     * otherActivities
     */
    @JsonProperty("otherActivities")
    private BigDecimal otherActivities;
    /**
     * reserve
     */
    @JsonProperty("reserve")
    private BigDecimal reserve;
    /**
     * paidToYou
     */
    @JsonProperty("paidToYou")
    private BigDecimal paidToYou;
    /**
     * closingBalance
     */
    @JsonProperty("closingBalance")
    private BigDecimal closingBalance;
    /**
     * scheduledSettlementDate
     */
    @JsonProperty("scheduledSettlementDate")
    private String scheduledSettlementDate;
    /**
     * paymentProcessor
     */
    @JsonProperty("paymentProcessor")
    private String paymentProcessor;
    /**
     * settleCycle
     */
    @JsonProperty("settleCycle")
    private String settleCycle;
    /**
     * reserveToDate
     */
    @JsonProperty("reserveToDate")
    private Integer reserveToDate;
    /**
     * lastUpdatedDate
     */
    @JsonProperty("lastUpdatedDate")
    private String lastUpdatedDate;
    /**
     * holdAmt
     */
    @JsonProperty("holdAmt")
    private BigDecimal holdAmt;
    /**
     * holdDates
     */
    @JsonProperty("holdDates")
    private String holdDates;
}
