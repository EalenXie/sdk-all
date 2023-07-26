package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/26 15:41
 * @version 1.0
 */
@Getter
@Setter
public class SubscriptionTransactionResponse {

    /**
     * transactions
     */
    @JsonProperty("transactions")
    private List<SubscriptionTransaction> transactions;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
