package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/27 13:42
 **/
@Getter
@Setter
public class PayoutItems {
    /**
     * The ID for the payout item. Viewable when you show details for a payout.
     */
    @JsonProperty("payout_item_id")
    private String payoutItemId;
    /**
     * The PayPal-generated ID for the transaction.
     */
    @JsonProperty("transaction_id")
    private String transactionId;
    /**
     * The unique PayPal-generated common ID created to link sender side and receiver side transaction.
     * Used for tracking.
     */
    @JsonProperty("activity_id")
    private String activityId;
    /**
     * The item transaction status.
     */
    @JsonProperty("transaction_status")
    private String transactionStatus;
    /**
     * The fee, in U.S. dollars.
     */
    @JsonProperty("payout_item_fee")
    private Amount payoutItemFee;
    /**
     * The PayPal-generated ID for the payout.
     */
    @JsonProperty("payout_batch_id")
    private String payoutBatchId;
    /**
     * The sender-provided information for the payout item.
     */
    @JsonProperty("payout_item")
    private PayoutItem payoutItem;
    /**
     * The date and time when this item was last processed, in Internet date and time format.
     */
    @JsonProperty("time_processed")
    private String timeProcessed;
    /**
     * An array of request-related HATEOAS links.
     */
    @JsonProperty("links")
    private List<Link> links;
    /**
     * A sender-specified ID.
     * Tracks the payout in an accounting system.
     * Should be unique within 30 days.
     */
    @JsonProperty("sender_batch_id")
    private String senderBatchId;

}

