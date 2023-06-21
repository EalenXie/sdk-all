package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:35
 */
@Getter
@Setter
public class StatusQuantity {
    /**
     * 数量单位 EACH、EA
     */
    @JsonProperty("unitOfMeasurement")
    private String unitOfMeasurement;
    @JsonProperty("amount")
    private String amount;
}
