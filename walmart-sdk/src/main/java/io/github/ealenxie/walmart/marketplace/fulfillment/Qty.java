package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@NoArgsConstructor
@Data
public class Qty {
    /**
     * unitOfMeasure
     */
    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;
    /**
     * measurementValue
     */
    @JsonProperty("measurementValue")
    private Integer measurementValue;
}
