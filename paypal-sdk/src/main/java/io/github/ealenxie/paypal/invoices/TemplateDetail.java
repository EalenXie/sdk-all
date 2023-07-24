package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class TemplateDetail {
    /**
     * reference
     */
    @JsonProperty("reference")
    private String reference;
    /**
     * currencyCode
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * termsAndConditions
     */
    @JsonProperty("terms_and_conditions")
    private String termsAndConditions;
    /**
     * memo
     */
    @JsonProperty("memo")
    private String memo;
    /**
     * attachments
     */
    @JsonProperty("attachments")
    private List<Attachment> attachments;
    /**
     * paymentTerm
     */
    @JsonProperty("payment_term")
    private PaymentTerm paymentTerm;
    /**
     * metadata
     */
    @JsonProperty("metadata")
    private Metadata metadata;
}
