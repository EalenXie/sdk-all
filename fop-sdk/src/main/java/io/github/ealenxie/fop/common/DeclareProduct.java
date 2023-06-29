package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareProduct {
    /**
     * 申报产品代码（客户自定义申报产品代码）
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;

    /**
     * 申报品名类目ID
     */
    @JsonProperty("declare_product_id")
    private String declareProductId;

    /**
     * 申报产品用途
     */
    @JsonProperty("uses")
    private String uses;

    /**
     * 申报产品规格
     */
    @JsonProperty("specification")
    private String specification;

    /**
     * 申报产品型号
     */
    @JsonProperty("model")
    private String model;

    /**
     * 申报产品材质
     */
    @JsonProperty("material")
    private String material;

    /**
     * 申报产品状态。
     * <p>
     * 如：N(草稿)；S(待审核)；C（已审核)；E(异常)；X(已作废)
     */
    @JsonProperty("declare_product_status")
    private String declareProductStatus;

    /**
     * 申报产品原产地。国家二字码，详细参考国际二字码。
     * <p>
     * 如：CN（中国）
     */
    @JsonProperty("origin_country")
    private String originCountry;

    /**
     * 申报国家列表
     */
    @JsonProperty("declare_country_list")
    private List<DeclareProductCountry> declareCountryList;

    /**
     * 申报SKU列表
     */
    @JsonProperty("declare_sku_list")
    private List<DeclareSkuStatusPayload> declareSkuList;

    /**
     * 审核异常原因
     */
    @JsonProperty("exception_reason")
    private String exceptionReason;
}
