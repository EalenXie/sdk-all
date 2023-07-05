package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.NamePayload;
import io.github.ealenxie.allegro.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
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
    private NamePayload subject;
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
    private User buyer;
    /**
     * object (DisputeCheckoutForm)
     */
    @JsonProperty("checkoutForm")
    private DisputeCheckoutForm checkoutForm;
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
