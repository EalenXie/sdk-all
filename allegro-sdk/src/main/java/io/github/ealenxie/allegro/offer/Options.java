package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@Getter
@Setter
public class Options {
    /**
     * identifiesProduct
     */
    @JsonProperty("identifiesProduct")
    private Boolean identifiesProduct;
    /**
     * isGTIN
     */
    @JsonProperty("isGTIN")
    private Boolean isGTIN;
}
