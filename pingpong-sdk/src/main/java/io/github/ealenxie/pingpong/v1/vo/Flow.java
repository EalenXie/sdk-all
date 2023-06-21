package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 14:53
 */
@Getter
@Setter
public class Flow {
    /**
     * 客户ID
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 店铺ID
     */
    @JsonProperty("account_id")
    private String accountId;
    /**
     * 业务流水号
     */
    @JsonProperty("tx_id")
    private String txId;
    /**
     * 发生时间(格式：yyyyMMddHHmmss)
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    @JsonProperty("transfer_time")
    private String transferTime;
    /**
     * 出入账类型(in 是入账，out是出账)
     */
    @JsonProperty("transfer_type")
    private String transferType;
    /**
     * 发生金额(eg.123.45)
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 平台
     */
    @JsonProperty("platform")
    private String platform;
}
