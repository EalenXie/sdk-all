package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/27 13:43
 **/
@Getter
@Setter
public class PayoutItem {
    /**
     * The ID type that identifies the payment receiver.
     * Enum:	Description
     * EMAIL	An unencrypted email. Value is a string of up to 127 single-byte characters.
     * PHONE	An unencrypted phone number.
     * PAYPAL_ID	An encrypted PayPal account number.
     */
    @JsonProperty("recipient_type")
    private String recipientType;
    /**
     * The currency and amount of payout item.
     * Might be an integer for currencies like JPY that are not typically fractional or a decimal fraction for currencies like TND that are subdivided into thousandths.
     * For the required number of decimal places for a currency code, see Currency codes - ISO 4217.
     */
    @JsonProperty("amount")
    private Amount amount;
    /**
     * The sender-specified note for notifications.
     * Supports up to 4000 ASCII characters and 1000 non-ASCII characters.
     */
    @JsonProperty("note")
    private String note;
    /**
     * The receiver of the payment.
     * Corresponds to the recipient_type value in the request.
     */
    @JsonProperty("receiver")
    private String receiver;
    /**
     * A sender-specified ID number.
     * Tracks the payout in an accounting system.
     */
    @JsonProperty("sender_item_id")
    private String senderItemId;
    /**
     * The recipient wallet.
     * Enum:	Description
     * PAYPAL Wallet.
     * VENMO Wallet.
     * RECIPIENT_SELECTED	Recipient selects how to receive payment from payment options.
     */
    @JsonProperty("recipient_wallet")
    private String recipientWallet;
    /**
     * The name of the recipient where money is credited.
     * For UNCLAIMED payments, the recipient name is populated after the payment is claimed.
     */
    @JsonProperty("recipient_name")
    private Recipient recipientName;
}

