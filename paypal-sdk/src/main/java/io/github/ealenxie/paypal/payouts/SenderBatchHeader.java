package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/26 15:42
 **/
@Getter
@Setter
public class SenderBatchHeader {
    /**
     * A sender-specified ID number. Tracks the payout in an accounting system.
     */
    @JsonProperty("sender_batch_id")
    private String senderBatchId;
    /**
     * The ID type that identifies the recipient of the payment. For example, EMAIL.
     * */
    @JsonProperty("recipient_type")
    private String recipientType;
    /**
     * The subject line for the email that PayPal sends when payment for a payout item completes.
     * The subject line is the same for all recipients. Value is an alphanumeric string of up to 255 single-byte characters.
     */
    @JsonProperty("email_subject")
    private String emailSubject;
    /**
     * The email message that PayPal sends when the payout item completes.
     * The message is the same for all recipients.
     */
    @JsonProperty("email_message")
    private String emailMessage;
    /**
     * The payouts and item-level notes are concatenated in the email.
     * The maximum combined length of the notes is 1000 characters.
     */
    @JsonProperty("note")
    private String note;
}

