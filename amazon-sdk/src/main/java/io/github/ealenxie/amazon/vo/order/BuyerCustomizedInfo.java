package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuyerCustomizedInfo {
    /**
     * The location of a zip file containing Amazon Custom data.
     */
    @JsonProperty("value")
    private String value;
}