package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/26 17:52
 **/
@Getter
@Setter
public class BatchHeader {

    /**
     * The date and time when processing for the payout began, in Internet date and time format.
     */
    @JsonProperty("time_created")
    private String timeCreated;
    /**
     * The date and time when processing for the payout was completed, in Internet date and time format.
     */
    @JsonProperty("time_completed")
    private String timeCompleted;
    /**
     * The date and time when the payout was closed, in Internet date and time format.
     * A payout is considered closed when all items in a batch are processed and the available balance from the temporary hold is released.
     */
    @JsonProperty("time_closed")
    private String timeClosed;
    /**
     * The currency and total amount requested for the payouts.
     */
    @JsonProperty("amount")
    private Amount amount;
    /**
     * The currency and amount of the total estimate for the applicable payouts fees.
     * Initially, the fee is 0.
     * The fee is populated after the payout moves to the PROCESSING state.
     */
    @JsonProperty("fees")
    private Amount fees;
    /**
     * displayable
     */
    @JsonProperty("displayable")
    private Boolean displayable;
    /**
     * The original payout header, as provided by the payment sender.
     */
    @JsonProperty("sender_batch_header")
    private SenderBatchHeader senderBatchHeader;
    /**
     * The PayPal-generated ID for a payout.
     */
    @JsonProperty("payout_batch_id")
    private String payoutBatchId;
    /**
     * The PayPal-generated payout status.
     * If the payout passes preliminary checks, the status is PENDING.
     * Enum:	Description
     * DENIED	Your payout requests were denied, so they were not processed. Check the error messages to see any steps necessary to fix these issues.
     * PENDING	Your payout requests were received and will be processed soon.
     * PROCESSING	Your payout requests were received and are now being processed.
     * SUCCESS	Your payout batch was processed and completed. Check the status of each item for any holds or unclaimed transactions.
     * CANCELED	The payouts file that was uploaded through the PayPal portal was cancelled by the sender.
     */
    @JsonProperty("batch_status")
    private String batchStatus;
}

