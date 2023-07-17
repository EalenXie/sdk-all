package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 11:13
 */
@NoArgsConstructor
@Data
public class CurrentProduct {
    /**
     * productDesc
     */
    @JsonProperty("productDesc")
    private String productDesc;
    /**
     * isUsable
     */
    @JsonProperty("isUsable")
    private String isUsable;
    /**
     * estimateDeliveryDate
     */
    @JsonProperty("estimateDeliveryDate")
    private String estimateDeliveryDate;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * estimateFee
     */
    @JsonProperty("estimateFee")
    private Double estimateFee;
    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
}
