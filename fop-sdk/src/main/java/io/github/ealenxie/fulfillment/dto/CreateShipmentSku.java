package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateShipmentSku {
    @JsonProperty("sku_code")
    private String skuCode;
    @JsonProperty("qty")
    private Integer qty;
}
