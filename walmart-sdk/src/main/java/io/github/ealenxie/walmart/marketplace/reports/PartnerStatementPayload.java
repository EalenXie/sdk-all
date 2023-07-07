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
