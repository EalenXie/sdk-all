package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@NoArgsConstructor
@Data
public class DisputedTransaction {
    /**
     * sellerTransactionId
     */
    @JsonProperty("seller_transaction_id")
    private String sellerTransactionId;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * transactionStatus
     */
    @JsonProperty("transaction_status")
    private String transactionStatus;
    /**
     * grossAmount
     */
    @JsonProperty("gross_amount")
    private Money grossAmount;
    /**
     * buyer
     */
    @JsonProperty("buyer")
    private Buyer buyer;
    /**
     * seller
     */
    @JsonProperty("seller")
    private Seller seller;
}
