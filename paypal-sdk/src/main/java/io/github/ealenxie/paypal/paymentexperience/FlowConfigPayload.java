package io.github.ealenxie.paypal.paymentexperience;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/29 11:37
 */
@NoArgsConstructor
@Data
public class FlowConfigPayload {
    /**
     * landingPageType
     */
    @JsonProperty("landing_page_type")
    private String landingPageType;
    /**
     * bankTxnPendingUrl
     */
    @JsonProperty("bank_txn_pending_url")
    private String bankTxnPendingUrl;
}
