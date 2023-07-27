package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/26 15:18
 **/
@Getter
@Setter
public class PayoutPayload {

    /**
     * An array of individual payout items.
     */
    @JsonProperty("items")
    private List<Item> items;
    /**
     * The sender-provided payout header for a payout request.
     */
    @JsonProperty("sender_batch_header")
    private SenderBatchHeader senderBatchHeader;
}

