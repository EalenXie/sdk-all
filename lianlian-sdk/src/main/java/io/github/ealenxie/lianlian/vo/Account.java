package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/8 14:00
 */
@Getter
@Setter
public class Account {
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("region")
    private String region;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("holderName")
    private String holderName;
    @JsonProperty("createTime")
    private String createTime;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("balanceUpdateTime")
    private String balanceUpdateTime;
    @JsonProperty("shopName")
    private String shopName;
    @JsonProperty("shopStatus")
    private Integer shopStatus;
    @JsonProperty("virtualCardNo")
    private String virtualCardNo;
    @JsonProperty("appendInfo")
    private String appendInfo;
    @JsonProperty("feeRate")
    private String feeRate;
    @JsonProperty("sellerId")
    private String sellerId;
}
