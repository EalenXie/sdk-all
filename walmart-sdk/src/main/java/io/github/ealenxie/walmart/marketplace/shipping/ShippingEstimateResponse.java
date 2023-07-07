package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 10:50
 */
@Getter
@Setter
public class ShippingEstimateResponse {


    /**
     * estimates
     */
    @JsonProperty("estimates")
    private List<Estimates> estimates;
    /**
     * alertMessage
     */
    @JsonProperty("alertMessage")
    private String alertMessage;
}
