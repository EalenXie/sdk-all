package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/18 13:52
 */
@NoArgsConstructor
@Data
public class DisputeItem {
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
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * disputeState
     */
    @JsonProperty("dispute_state")
    private String disputeState;
    /**
     * disputeAmount
     */
    @JsonProperty("dispute_amount")
    private Money disputeAmount;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
    /**
     * disputeAsset
     */
    @JsonProperty("dispute_asset")
    private DisputeAsset disputeAsset;
}
