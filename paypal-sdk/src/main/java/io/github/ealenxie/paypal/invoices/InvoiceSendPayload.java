package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/21 10:32
 */
@NoArgsConstructor
@Data
public class InvoiceSendPayload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("subject")
    private String subject;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("note")
    private String note;
    /**
     * sendToInvoicer
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("send_to_invoicer")
    private Boolean sendToInvoicer;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("send_to_recipient")
    private Boolean sendToRecipient;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("additional_recipients")
    private List<String> additionalRecipients;


}
