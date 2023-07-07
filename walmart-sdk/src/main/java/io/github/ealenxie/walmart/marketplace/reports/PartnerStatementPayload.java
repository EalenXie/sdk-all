package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@Getter
@Setter
public class PartnerStatementPayload {
    /**
     * outstandingMCABalance
     */
    @JsonProperty("outstandingMCABalance")
    private BigDecimal outstandingMCABalance;
    /**
     * sellerInfo
     */
    @JsonProperty("sellerInfo")
    private SellerInfo sellerInfo;
    /**
     * accountSummary
     */
    @JsonProperty("accountSummary")
    private AccountSummary accountSummary;
    /**
     * transactionDetails
     */
    @JsonProperty("transactionDetails")
    private TransactionDetails transactionDetails;
}
