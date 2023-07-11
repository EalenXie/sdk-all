package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 9:54
 * @version 1.0
 */
@Getter
@Setter
public class Quantity {
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
