package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/7 17:12
 */
@Getter
@Setter
public class TransactionEntry {
    @JsonProperty("transId")
    private String transId;
    @JsonProperty("creditStatus")
    private String creditStatus;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("region")
    private String region;
    @JsonProperty("shopName")
    private String shopName;
    @JsonProperty("virtualCardNo")
    private String virtualCardNo;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("createTime")
    private String createTime;
    @JsonProperty("acctDate")
    private String acctDate;
    @JsonProperty("fundsId")
    private String fundsId;
}
