package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:47
 */
@Getter
@Setter
public class ParcelProduct {
    @JsonProperty("skuCode")
    private String skuCode;
    @JsonProperty("standardProductBarcode")
    private String standardProductBarcode;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("productUnitPrice")
    private Integer productUnitPrice;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("qty")
    private Integer qty;
}
