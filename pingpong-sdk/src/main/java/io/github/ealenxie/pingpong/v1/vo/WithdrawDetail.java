package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 16:34
 */
@Getter
@Setter
public class WithdrawDetail {

    /**
     * 业务流水号
     */
    @JsonProperty("tx_id")
    private String txId;
    /**
     * 平台
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 提现时间(格式：yyyyMMddHHmmss)
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    @JsonProperty("withdraw_time")
    private String withdrawTime;
    /**
     * 提现金额
     */
    @JsonProperty("withdraw_amount")
    private String withdrawAmount;
    /**
     * 提现币种
     */
    @JsonProperty("withdraw_currency")
    private String withdrawCurrency;
    /**
     * 提现费率
     */
    @JsonProperty("fee_rate")
    private String feeRate;
    /**
     * 提现手续费
     */
    @JsonProperty("fee")
    private String fee;
    /**
     * 到账金额
     */
    @JsonProperty("paid_amount")
    private String paidAmount;
    /**
     * 到账币种
     */
    @JsonProperty("paid_currency")
    private String paidCurrency;
    /**
     * 银⾏
     */
    @JsonProperty("bank")
    private String bank;
    /**
     * 卡号
     */
    @JsonProperty("card")
    private String card;
    /**
     * 提现类型
     * Normal:正常提现
     * Special_Withdraw:特殊提现
     */
    @JsonProperty("withdraw_type")
    private String withdrawType;
}
