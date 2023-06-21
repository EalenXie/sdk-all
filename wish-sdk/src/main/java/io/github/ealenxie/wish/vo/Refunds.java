package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class Refunds {
    @JsonProperty("refund_reason_note")
    private String refundReasonNote;
    @JsonProperty("refund_source")
    private String refundSource;
    @JsonProperty("refund_amount")
    private Amount refundAmount;
    @JsonProperty("merchant_responsible_amount")
    private Amount merchantResponsibleAmount;
    @JsonProperty("refund_time")
    private String refundTime;
    @JsonProperty("refund_reason")
    private String refundReason;
}
