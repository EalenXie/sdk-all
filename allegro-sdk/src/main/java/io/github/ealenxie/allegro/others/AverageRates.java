package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class AverageRates {
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private Double delivery;
    /**
     * deliveryCost
     */
    @JsonProperty("deliveryCost")
    private Integer deliveryCost;
    /**
     * description
     */
    @JsonProperty("description")
    private Double description;
    /**
     * service
     */
    @JsonProperty("service")
    private Double service;
}
