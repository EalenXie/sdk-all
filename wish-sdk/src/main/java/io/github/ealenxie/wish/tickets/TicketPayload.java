package io.github.ealenxie.wish.tickets;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 14:06
 * @version 1.0
 */
@Setter
@Getter
public class TicketPayload {

    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * subLabel
     */
    @JsonProperty("sub_label")
    private String subLabel;
    /**
     * updatedAt
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * resolutionInfo
     */
    @JsonProperty("resolution_info")
    private ResolutionInfo resolutionInfo;
    /**
     * orders
     */
    @JsonProperty("orders")
    private List<IdPayload> orders;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * products
     */
    @JsonProperty("products")
    private List<IdPayload> products;
    /**
     * buyerInfo
     */
    @JsonProperty("buyer_info")
    private BuyerInfo buyerInfo;
    /**
     * replies
     */
    @JsonProperty("replies")
    private List<Replies> replies;
    /**
     * openedAt
     */
    @JsonProperty("opened_at")
    private String openedAt;
    /**
     * merchantId
     */
    @JsonProperty("merchant_id")
    private String merchantId;
    /**
     * refundReason
     */
    @JsonProperty("refund_reason")
    private String refundReason;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * subject
     */
    @JsonProperty("subject")
    private String subject;
}
