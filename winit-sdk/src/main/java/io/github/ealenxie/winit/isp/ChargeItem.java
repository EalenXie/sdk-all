package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/14 17:22
 */
@Getter
@Setter
public class ChargeItem {
    
    /**
     * amount
     */
    @JsonProperty("amount")
    private BigDecimal amount;
    /**
     * currencyCode
     */
    @JsonProperty("currencyCode")
    private String currencyCode;
    /**
     * chargeName
     */
    @JsonProperty("chargeName")
    private String chargeName;
}
