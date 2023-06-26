package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 9:50
 */
@Getter
@Setter
public class BoxDetail {
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * FBA商品编码
     */
    @JsonProperty("fba_product_code")
    private String fbaProductCode;
    /**
     * 序列号集成码
     */
    @JsonProperty("data_code")
    private String dataCode;
    /**
     * 序列号
     */
    @JsonProperty("serial_number")
    private String serialNumber;
}
