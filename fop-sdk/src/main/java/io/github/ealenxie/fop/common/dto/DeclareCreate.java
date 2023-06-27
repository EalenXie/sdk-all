package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:07
 */
@Getter
@Setter
public class DeclareCreate {
    /**
     * 申报品名类目ID
     */
    @JsonProperty("declare_category_id")
    private String declareCategoryId;

    /**
     * 申报国家列表
     */
    @JsonProperty("declare_country_list")
    private List<DeclareCountryDTO> declareCountryList;

    /**
     * 申报产品代码
     * <p>
     * 客户自定义申报产品代码
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;

    /**
     * 申报SKU列表
     */
    @JsonProperty("declare_sku_list")
    private List<DeclareSku> declareSkus;

    /**
     * 申报产品材质
     */
    @JsonProperty("material")
    private String material;

    /**
     * 申报产品型号
     */
    @JsonProperty("model")
    private String model;

    /**
     * 申报产品原产地(国家二字码)
     * <p>
     * 详细参考国际二字码。如：CN（中国）
     */
    @JsonProperty("origin_country")
    private String originCountry;

    /**
     * 申报产品规格
     */
    @JsonProperty("specification")
    private String specification;

    /**
     * 申报产品用途
     */
    @JsonProperty("uses")
    private String uses;
}
