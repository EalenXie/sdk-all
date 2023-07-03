package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author TangShangCheng
 * @date 2023年07月03日, 0003 10:14
 */
@NoArgsConstructor
@Data
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
