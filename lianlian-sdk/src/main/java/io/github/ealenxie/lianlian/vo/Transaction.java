package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/7 13:25
 */
@Getter
@Setter
public class Transaction {
    @JsonProperty("transId")
    private String transId;
    @JsonProperty("transType")
    private String transType;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("region")
    private String region;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("virtualCardNo")
    private String virtualCardNo;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("balance")
    private String balance;
    @SuppressWarnings("all")
    @JsonProperty("busiType")
    private String busiType;
    @JsonProperty("transTime")
    private String transTime;
    @JsonProperty("remark")
    private String remark;
}
