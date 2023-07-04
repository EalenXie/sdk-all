package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    @JsonProperty("sku")
    private String sku;
    /**
     * 产品名称
     */
    @JsonProperty("productName")
    private String productName;
}
