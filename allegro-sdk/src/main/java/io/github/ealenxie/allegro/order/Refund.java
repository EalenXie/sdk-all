package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.Money;
import io.github.ealenxie.allegro.MoneyValuePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 11:19
 */
@Getter
@Setter
public class Refund {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * payment
     */
    @JsonProperty("payment")
    private IdPayload payment;
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
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * totalValue
     */
    @JsonProperty("totalValue")
    private Money totalValue;
    /**
     * lineItems
     */
    @JsonProperty("lineItems")
    private List<RefundLineItem> lineItems;
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private MoneyValuePayload delivery;
    /**
     * overpaid
     */
    @JsonProperty("overpaid")
    private MoneyValuePayload overpaid;
    /**
     * surcharges
     */
    @JsonProperty("surcharges")
    private List<Surcharges> surcharges;
    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private MoneyValuePayload additionalServices;
    /**
     * sellerComment
     */
    @JsonProperty("sellerComment")
    private String sellerComment;
}
