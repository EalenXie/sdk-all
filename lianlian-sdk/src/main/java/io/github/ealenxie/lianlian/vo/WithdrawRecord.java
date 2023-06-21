package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/6/7 17:26
 */
@Getter
@Setter
public class WithdrawRecord {
    @JsonProperty("transId")
    private String transId;
    @JsonProperty("externalTransId")
    private String externalTransId;
    @JsonProperty("withdrawStatus")
    private Integer withdrawStatus;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("region")
    private String region;
    @JsonProperty("withdrawAmount")
    private String withdrawAmount;
    @JsonProperty("withdrawCurrency")
    private String withdrawCurrency;
    @JsonProperty("arrivalAmount")
    private String arrivalAmount;
    @JsonProperty("arrivalCurrency")
    private String arrivalCurrency;
    @JsonProperty("feeAmount")
    private String feeAmount;
    @JsonProperty("actualFeeAmount")
    private String actualFeeAmount;
    @JsonProperty("feeCurrency")
    private String feeCurrency;
    @JsonProperty("createTime")
    private String createTime;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("rateTime")
    private String rateTime;
    @JsonProperty("bankAccountName")
    private String bankAccountName;
    @JsonProperty("bankName")
    private String bankName;
    @JsonProperty("bankCardNo")
    private String bankCardNo;
    @JsonProperty("withdrawDetailList")
    private List<WithdrawDetail> withdrawDetailList;
    @JsonProperty("feeRate")
    private String feeRate;
}
