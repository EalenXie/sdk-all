package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/3 12:47
 */
@Getter
@Setter
public class Dispute {
    /**
     * Identifier of the dispute
     */
    @JsonProperty("id")
    private String id;
    /**
     * object (Subject)
     * Subject of the dispute
     */
    @JsonProperty("subject")
    private Subject subject;
    /**
     * string
     * Enum: "CLOSED" "ONGOING" "UNRESOLVED"
     */
    @JsonProperty("status")
    private String status;
    /**
     * string
     * Enum: "NEW" "SELLER_REPLIED" "BUYER_REPLIED" "ALLEGRO_ADVISOR_REPLIED"
     */
    @JsonProperty("messagesStatus")
    private String messagesStatus;
    /**
     * required
     * object (DisputeUser)
     */
    @JsonProperty("buyer")
    private Buyer buyer;
    /**
     * object (DisputeCheckoutForm)
     */
    @JsonProperty("checkoutForm")
    private CheckoutForm checkoutForm;
    /**
     * object (DisputeFirstMessage)
     * Initial dispute message with text OR attachment OR both
     */
    @JsonProperty("message")
    private Message message;
    /**
     * integer <int32> >= 0
     */
    @JsonProperty("messagesCount")
    private Integer messagesCount;
    /**
     * string <date-time>
     */
    @JsonProperty("lastMessageCreationDate")
    private String lastMessageCreationDate;
}
