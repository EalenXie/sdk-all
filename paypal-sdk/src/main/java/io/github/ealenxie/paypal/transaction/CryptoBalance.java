package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CryptoBalance {

    /**
     * 资产符号
     */
    @JsonProperty("asset_symbol")
    private String assetSymbol;

    /**
     * 数量
     */
    @JsonProperty("quantity")
    private String quantity;
}
