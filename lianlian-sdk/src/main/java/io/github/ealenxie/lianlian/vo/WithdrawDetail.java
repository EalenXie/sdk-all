package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/7 17:26
 */
@Getter
@Setter
public class WithdrawDetail {
    @JsonProperty("detailTransId")
    private String detailTransId;
    @JsonProperty("shopName")
    private String shopName;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("feeRate")
    private String feeRate;
    @JsonProperty("feeAmount")
    private String feeAmount;
    @JsonProperty("actualFeeAmount")
    private String actualFeeAmount;
}
