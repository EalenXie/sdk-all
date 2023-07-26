package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/18 15:11
 * @version 1.0
 */
@Getter
@Setter
public class PlanResponse {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * billingCycles
     */
    @JsonProperty("billing_cycles")
    private List<BillingPayload> billingCycles;
    /**
     * paymentPreferences
     */
    @JsonProperty("payment_preferences")
    private PaymentPreferences paymentPreferences;
    /**
     * taxes
     */
    @JsonProperty("taxes")
    private Taxes taxes;
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
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
