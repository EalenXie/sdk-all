package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@NoArgsConstructor
@Data
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
