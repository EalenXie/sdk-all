package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 10:05
 */
@Getter
@Setter
public class BatchOfferModify {
    /**
     * additionalServicesGroup
     */
    @JsonProperty("additionalServicesGroup")
    private IdPayload additionalServicesGroup;
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * discounts
     */
    @JsonProperty("discounts")
    private Discounts discounts;
    /**
     * location
     */
    @JsonProperty("location")
    private Location location;
    /**
     * payments
     */
    @JsonProperty("payments")
    private ModifyPayments payments;
    /**
     * promotion
     */
    @JsonProperty("promotion")
    private Promotion promotion;
    /**
     * sizeTable
     */
    @JsonProperty("sizeTable")
    private IdPayload sizeTable;
    /**
     * publication
     */
    @JsonProperty("publication")
    private OfferModifyPublish publication;
}
