package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/14 12:32
 */
@Getter
@Setter
public class AddProductResponse extends ResponseAsk<Void> {

    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("product_barcode")
    private String productBarcode;

}
