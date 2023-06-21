package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@Getter
@Setter
public class References {
    /**
     * referenceType所指的id值
     */
    @JsonProperty("referenceId")
    private String referenceId;
    /**
     * 枚举值：CANCELLATION_ID、CASE_ID、INVOICE、ITEM_ID、ORDER_ID、PAYMENTS_DISPUTE_ID、REFUND_ID、LOAN_REPAYMENT_ID、RETURN_ID、PAYOUT_ID
     */
    @JsonProperty("referenceType")
    private String referenceType;
}
