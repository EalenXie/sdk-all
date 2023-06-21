package io.github.ealenxie.wish.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/21 15:14
 */
@Getter
@Setter
public class RefundDTO {

    @JsonProperty("refund_reason_note")
    private String refundReasonNote;
    @JsonProperty("refund_reason")
    private String refundReason;
}
