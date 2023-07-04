package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/08/04 12:30
 */
@Getter
@Setter
public class Charges {
    @JsonProperty("charge")
    private List<Charge> charge;
}
