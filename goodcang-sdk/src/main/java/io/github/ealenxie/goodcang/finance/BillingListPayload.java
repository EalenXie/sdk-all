package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 12:33
 */
@Getter
@Setter
public class BillingListPayload extends PagePayload {
    /**
     * 账单号
     */
    @JsonProperty("bill_number")
    private String billNumber;
    /**
     * 账单截至时间开始
     */
    @JsonProperty("begin_bill_to_time")
    private String beginBillToTime;
    /**
     * 账单截至时间结束
     */
    @JsonProperty("end_bill_to_time")
    private String endBillToTime;
    /**
     * 账户编码
     */
    @JsonProperty("account_code")
    private String accountCode;
}
