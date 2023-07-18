package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/18 13:52
 */
@NoArgsConstructor
@Data
public class DisputeAsset {
    /**
     * assetSymbol
     */
    @JsonProperty("asset_symbol")
    private String assetSymbol;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private String quantity;
}
