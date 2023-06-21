package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 15:43
 */
@Getter
@Setter
public class Payouts {
    @JsonProperty("payoutId")
    private String payoutId;
    @JsonProperty("payoutStatus")
    private String payoutStatus;
    @JsonProperty("payoutStatusDescription")
    private String payoutStatusDescription;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("payoutDate")
    private String payoutDate;
    @JsonProperty("lastAttemptedPayoutDate")
    private String lastAttemptedPayoutDate;
    @JsonProperty("transactionCount")
    private Integer transactionCount;
    @JsonProperty("payoutInstrument")
    private PayoutInstrument payoutInstrument;
    @JsonProperty("payoutMemo")
    private String payoutMemo;
}
