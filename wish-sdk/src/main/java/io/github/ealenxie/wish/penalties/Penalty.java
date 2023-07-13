package io.github.ealenxie.wish.penalties;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 14:11
 */
@Getter
@Setter
public class Penalty {

    /**
     * penaltyReason
     */
    @JsonProperty("penalty_reason")
    private String penaltyReason;
    /**
     * reversedAt
     */
    @JsonProperty("reversed_at")
    private String reversedAt;
    /**
     * relatedEntityType
     */
    @JsonProperty("related_entity_type")
    private String relatedEntityType;
    /**
     * relatedEntityId
     */
    @JsonProperty("related_entity_id")
    private String relatedEntityId;
    /**
     * penaltyAmount
     */
    @JsonProperty("penalty_amount")
    private Money penaltyAmount;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * reversed
     */
    @JsonProperty("reversed")
    private Boolean reversed;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
