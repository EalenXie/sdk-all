package io.github.ealenxie.fop.common;

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
    /**
     * 申报产品代码（客户自定义产品代码）。
     * <p>
     * 申报产品和SKU编码必须传入一个。
     * 申报产品代码和SKU编码只能支持一个查询,两个参数同时传入时，只支持申报产品代码查询。
     * <p>
     * *注：最大支持传入100个申报产品代码查询
     */
    @JsonProperty("declare_product_code")
    private List<String> declareProductCode;

    /**
     * SKU编号。
     * <p>
     * 申报产品和SKU编码必须传入一个。
     * 申报产品代码和SKU编码只能支持一个查询,两个参数同时传入时，只支持申报产品代码查询。
     * <p>
     * *注：最大支持传人100个SKU查询。
     */
    @JsonProperty("sku_code")
    private List<String> skuCode;
}
