package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 12:38
 */
@Getter
@Setter
public class Billing {

    /**
     * 交易流水号
     */
    @JsonProperty("bill_number")
    private String billNumber;
    /**
     * 账户编码
     */
    @JsonProperty("account_code")
    private String accountCode;
    /**
     * 账单开始日期
     */
    @JsonProperty("bill_from_time")
    private String billFromTime;
    /**
     * 账单结束日期
     */
    @JsonProperty("bill_to_time")
    private String billToTime;
    /**
     * 账单文件地址
     */
    @JsonProperty("bill_file_path")
    private String billFilePath;
    /**
     * 账单总金额
     */
    @JsonProperty("all_total")
    private List<BalancePayload> allTotal;
    /**
     * 期初余额
     */
    @JsonProperty("start_balance")
    private List<BalancePayload> startBalance;
    /**
     * 期末余额
     */
    @JsonProperty("end_balance")
    private List<BalancePayload> endBalance;
    /**
     * 返现金额
     */
    @JsonProperty("cash_back_balance")
    private List<BalancePayload> cashBackBalance;
}
