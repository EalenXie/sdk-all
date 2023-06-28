package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateShipmentSku {
    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * SKU数量
     */
    @JsonProperty("qty")
    private Integer qty;
}
