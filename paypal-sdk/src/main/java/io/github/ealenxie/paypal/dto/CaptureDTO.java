package io.github.ealenxie.paypal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/28 15:04
 */
@Getter
@Setter
public class CaptureDTO {

    @JsonProperty("amount")
    private Money amount;
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("final_capture")
    private Boolean finalCapture;
    @JsonProperty("note_to_payer")
    private String noteToPayer;
    @JsonProperty("soft_descriptor")
    private String softDescriptor;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment_instruction")
    private Money paymentInstruction;
}
