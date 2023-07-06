package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 9:49
 */
@Getter
@Setter
public class UnitAmount {

    /**
     * unitOfMeasurement
     */
    @JsonProperty("unitOfMeasurement")
    private String unitOfMeasurement;
    /**
     * amount
     */
    @JsonProperty("amount")
    private String amount;
}
