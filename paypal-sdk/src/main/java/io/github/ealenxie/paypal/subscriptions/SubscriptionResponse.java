package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/26 14:16
 * @version 1.0
 */
@Getter
@Setter
public class SubscriptionResponse {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * planId
     */
    @JsonProperty("plan_id")
    private String planId;
    /**
     * startTime
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * shippingAmount
     */
    @JsonProperty("shipping_amount")
    private Money shippingAmount;
    /**
     * subscriber
     */
    @JsonProperty("subscriber")
    private SubscriberPayload subscriber;
    /**
     * billingInfo
     */
    @JsonProperty("billing_info")
    private BillingInfo billingInfo;
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
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * statusUpdateTime
     */
    @JsonProperty("status_update_time")
    private String statusUpdateTime;
}
