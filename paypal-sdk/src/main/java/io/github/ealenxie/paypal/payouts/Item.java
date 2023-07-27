package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/26 16:00
 **/
@Getter
@Setter
public class Item {

    /**
     * The recipient type. Value is:
     * EMAIL. The unencrypted email. Value is a string of up to 127 single-byte characters.
     * PHONE. The unencrypted phone number.
     * Note: The PayPal sandbox does not support the PHONE recipient type.
     * PAYPAL_ID. The encrypted PayPal account number.
     * If the sender_batch_header includes the recipient_type attribute, payout items use the recipient_type of the sender_batch_header, unless a payout item has its own recipient_type attribute.
     * If the sender_batch_header omits the recipient_type attribute, each payout item must include its own recipient_type value.
     */
    @JsonProperty("recipient_type")
    private String recipientType;
    /**
     * The sender-specified note for notifications.
     * Supports up to 4000 ASCII characters and 1000 non-ASCII characters.
     */
    @JsonProperty("note")
    private String note;
    /**
     * The receiver of the payment.
     * Corresponds to the recipient_type value in the request.
     * Max value of up to 127 single-byte characters.
     */
    @JsonProperty("receiver")
    private String receiver;
    /**
     * The sender-specified ID number. Tracks the payout in an accounting system.
     */
    @JsonProperty("sender_item_id")
    private String senderItemId;
    /**
     * The recipient wallet.
     */
    @JsonProperty("recipient_wallet")
    private String recipientWallet;
    /**
     * The currency and amount to pay the receiver.
     */
    @JsonProperty("amount")
    private Amount amount;
    /**
     * Captures additional notification modes to reach out to the receiver regarding this payment.
     */
    @JsonProperty("alternate_notification_method")
    private AlternateNotificationMethod alternateNotificationMethod;
    /**
     * The language tag for the language in which to localize the error-related strings, such as messages, issues, and suggested actions.
     * The tag is made up of the ISO 639-2 language code, the optional ISO-15924 script tag, and the ISO-3166 alpha-2 country code.
     */
    @JsonProperty("notification_language")
    private String notificationLanguage;
    /**
     * Metadata for accepting additional information from merchants to Venmo.
     */
    @JsonProperty("application_context")
    private ApplicationContext applicationContext;
}

