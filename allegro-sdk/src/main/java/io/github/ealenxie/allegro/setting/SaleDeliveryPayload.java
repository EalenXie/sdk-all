package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 14:48
 * @version 1.0
 */
@Setter
@Getter
public class SaleDeliveryPayload {

    /**
     * marketplace
     */
    @JsonProperty("marketplace")
    private IdPayload marketplace;
    /**
     * freeDelivery
     */
    @JsonProperty("freeDelivery")
    private Money freeDelivery;
    /**
     * abroadFreeDelivery
     */
    @JsonProperty("abroadFreeDelivery")
    private Money abroadFreeDelivery;
    /**
     * joinPolicy
     */
    @JsonProperty("joinPolicy")
    private JoinPolicy joinPolicy;
    /**
     * customCost
     */
    @JsonProperty("customCost")
    private CustomCost customCost;
    /**
     * updatedAt
     */
    @JsonProperty("updatedAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAt;
}
