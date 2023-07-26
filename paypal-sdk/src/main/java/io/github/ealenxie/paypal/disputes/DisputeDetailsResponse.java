package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@Getter
@Setter
public class DisputeDetailsResponse {

    /**
     * disputeId
     */
    @JsonProperty("dispute_id")
    private String disputeId;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * updateTime
     */
    @JsonProperty("update_time")
    private String updateTime;
    /**
     * disputedTransactions
     */
    @JsonProperty("disputed_transactions")
    private List<DisputedTransaction> disputedTransactions;
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * disputeAmount
     */
    @JsonProperty("dispute_amount")
    private Money disputeAmount;
    /**
     * disputeOutcome
     */
    @JsonProperty("dispute_outcome")
    private DisputeOutcome disputeOutcome;
    /**
     * disputeLifeCycleStage
     */
    @JsonProperty("dispute_life_cycle_stage")
    private String disputeLifeCycleStage;
    /**
     * disputeChannel
     */
    @JsonProperty("dispute_channel")
    private String disputeChannel;
    /**
     * messages
     */
    @JsonProperty("messages")
    private List<Message> messages;
    /**
     * extensions
     */
    @JsonProperty("extensions")
    private Extensions extensions;
    /**
     * offer
     */
    @JsonProperty("offer")
    private Offer offer;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
