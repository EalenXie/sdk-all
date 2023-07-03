package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Delivery {
    /**
     * availableForFree
     */
    @JsonProperty("availableForFree")
    private Boolean availableForFree;
    /**
     * lowestPrice
     */
    @JsonProperty("lowestPrice")
    private Money lowestPrice;
}
