package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * vc箱唛号与po单号对象
 */
@Setter
@Getter
public class CartonNumber {

    /**
     * VC 箱唛条码AMZNCC
     */
    @JsonProperty("carton_code")
    private String cartonCode;
    /**
     * VC客户 PO NO
     */
    @JsonProperty("sku_code")
    private String poItemCode;
    /**
     * VC sku 类型: model/UPC/ASIN
     */
    @JsonProperty("vcsku_type")
    private String vcSkuType;
}
