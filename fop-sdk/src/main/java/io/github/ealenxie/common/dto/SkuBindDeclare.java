package io.github.ealenxie.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:33
 */
@Getter
@Setter
public class SkuBindDeclare {

    @JsonProperty("declare_product_code")
    private String declareProductCode;
    @JsonProperty("declare_sku_list")
    private List<DeclareSku> declareSkus;
}
