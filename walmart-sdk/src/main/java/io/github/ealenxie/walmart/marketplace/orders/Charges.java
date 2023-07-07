package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@Getter
@Setter
public class Charges {
    /**
     * charge
     */
    @JsonProperty("charge")
    private List<Charge> charge;
}
