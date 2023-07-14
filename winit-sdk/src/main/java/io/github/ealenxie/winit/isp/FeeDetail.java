package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/7/14 18:01
 */
@Getter
@Setter
public class FeeDetail {
    /**
     * resultFee
     */
    @JsonProperty("resultFee")
    private BigDecimal resultFee;
    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * salesChangeItemName
     */
    @JsonProperty("salesChangeItemName")
    private String salesChangeItemName;
}
