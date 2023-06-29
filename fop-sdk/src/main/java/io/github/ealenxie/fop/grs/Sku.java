package io.github.ealenxie.fop.grs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 11:35
 */
@Getter
@Setter
public class Sku {
    @JsonProperty("skuCode")
    private String skuCode;
    @JsonProperty("productCode")
    private String productCode;
    @JsonProperty("actualQty")
    private Integer actualQty;
}
