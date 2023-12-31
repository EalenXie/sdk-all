package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@Getter
@Setter
public class Sla {
    /**
     * tier
     */
    @JsonProperty("tier")
    private String tier;
    /**
     * speed
     */
    @JsonProperty("speed")
    private String speed;
}
