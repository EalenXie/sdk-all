package io.github.ealenxie.fop.common;

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
    /**
     * 申报申报产品代码（客户自定义品牌）
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;

    /**
     * 申报SKU列表
     */
    @JsonProperty("declare_sku_list")
    private List<DeclareSku> declareSkus;
}
