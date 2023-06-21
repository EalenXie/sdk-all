package io.github.ealenxie.fop.grs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:15
 */
@Getter
@Setter
public class RmaInfoSku {
    @JsonProperty("sku_code")
    private String skuCode;
    @JsonProperty("plan_qty")
    private Integer planQty;
    @JsonProperty("sku_photograph_service")
    private String skuPhotographService;
    @JsonProperty("replace_product_code_service")
    private String replaceProductCodeService;
    @JsonProperty("new_product_code")
    private String newProductCode;
    @JsonProperty("expired_date")
    private String expiredDate;
}
