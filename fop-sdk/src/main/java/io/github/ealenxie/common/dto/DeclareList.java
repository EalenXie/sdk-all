package io.github.ealenxie.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:13
 */
@Getter
@Setter
public class DeclareList {

    @JsonProperty("declare_product_code")
    private List<String> declareProductCode;
    @JsonProperty("sku_code")
    private List<String> skuCode;
}
