package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class Product {
    @JsonProperty("sku_code")
    private String skuCode;
    @JsonProperty("standard_product_barcode")
    private String standardProductBarcode;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("product_description")
    private String productDescription;
    @JsonProperty("product_unit_price")
    private Integer productUnitPrice;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("qty")
    private Integer qty;
}
