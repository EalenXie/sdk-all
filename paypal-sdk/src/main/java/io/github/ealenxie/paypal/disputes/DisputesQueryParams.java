package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 13:46
 */
@Getter
@Setter
public class DisputesQueryParams {

    /**
     * startTime
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("start_time")
    private String startTime;
    /**
     * disputedTransactionId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("disputed_transaction_id")
    private String disputedTransactionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("next_page_token")
    private String nextPageToken;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dispute_state")
    private String disputeState;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("update_time_before")
    private String updateTimeBefore;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("update_time_after")
    private String updateTimeAfter;


}
