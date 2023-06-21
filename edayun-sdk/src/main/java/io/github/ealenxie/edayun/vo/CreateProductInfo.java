package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductInfo {


    /**
     * 产品SKU
     */
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("isSuccess")
    private Boolean isSuccess;
    /**
     * 产品ID
     */
    @JsonProperty("omniProductId")
    private Integer omniProductId;
    /**
     * 产品barcode
     */
    @JsonProperty("omniBarcode")
    private String omniBarcode;
}
