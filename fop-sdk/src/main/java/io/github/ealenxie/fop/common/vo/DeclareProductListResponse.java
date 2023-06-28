package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareProductListResponse {

    /**
     * 申报产品列表
     */
    @JsonProperty("declare_product_list")
    private List<DeclareProduct> declareProductList;
}
