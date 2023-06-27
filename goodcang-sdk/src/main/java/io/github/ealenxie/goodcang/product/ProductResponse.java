package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.ResponseAsk;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 12:32
 */
@Getter
@Setter
public class ProductResponse extends ResponseAsk<Void> {

    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("product_barcode")
    private String productBarcode;

}
