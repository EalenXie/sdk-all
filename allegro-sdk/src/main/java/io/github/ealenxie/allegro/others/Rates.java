package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Rates {
    /**
     * delivery
     */
    @JsonProperty("delivery")
    private Integer delivery;
    /**
     * deliveryCost
     */
    @JsonProperty("deliveryCost")
    private Integer deliveryCost;
    /**
     * description
     */
    @JsonProperty("description")
    private Integer description;
    /**
     * service
     */
    @JsonProperty("service")
    private Integer service;
}
