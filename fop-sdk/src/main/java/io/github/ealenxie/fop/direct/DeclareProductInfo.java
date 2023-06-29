package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class DeclareProductInfo {
    /**
     * 申报产品代码（在4PX已备案申报产品的代码）
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;

    /**
     * 申报品名(当地语言)
     */
    @JsonProperty("declare_product_name_cn")
    private String declareProductNameCn;

    /**
     * 申报品名（英语）
     */
    @JsonProperty("declare_product_name_en")
    private String declareProductNameEn;

    /**
     * 用途
     */
    @JsonProperty("uses")
    private String uses;

    /**
     * 规格
     */
    @JsonProperty("specification")
    private String specification;

    /**
     * 成分
     */
    @JsonProperty("component")
    private String component;

    /**
     * 单件商品净重（默认以g为单位）
     */
    @JsonProperty("unit_net_weight")
    private Integer unitNetWeight;

    /**
     * 单件商品毛重（默认以g为单位）
     */
    @JsonProperty("unit_gross_weight")
    private Integer unitGrossWeight;

    /**
     * 材质
     */
    @JsonProperty("material")
    private String material;

    /**
     * 申报数量
     */
    @JsonProperty("declare_product_code_qty")
    private Integer declareProductCodeQty;

    /**
     * 单位
     * <p>
     * 默认值：PCS
     */
    @JsonProperty("unit_declare_product")
    private String unitDeclareProduct;

    /**
     * 原产地（ISO标准2字码）
     */
    @JsonProperty("origin_country")
    private String originCountry;

    /**
     * 出口国/起始国/发件人国家（ISO标准2字码）
     */
    @JsonProperty("country_export")
    private String countryExport;

    /**
     * 进口国/目的国/收件人国家（ISO标准2字码）
     */
    @JsonProperty("country_import")
    private String countryImport;

    /**
     * 出口国/起始国/发件人国家_海关编码(只支持数字)
     */
    @JsonProperty("hscode_export")
    private String hscodeExport;

    /**
     * 进口国/目的国/收件人国家_海关编码(只支持数字)
     */
    @JsonProperty("hscode_import")
    private String hscodeImport;

    /**
     * 出口国/起始国/发件人国家_申报单价（按对应币别的法定单位，最多4位小数点）
     */
    @JsonProperty("declare_unit_price_export")
    private Integer declareUnitPriceExport;

    /**
     * 出口国/起始国/发件人国家_申报单价币种（按照ISO标准；支持的币种，根据物流产品+收件人国家配置；币种需和进口国申报币种一致）
     */
    @JsonProperty("currency_export")
    private String currencyExport;

    /**
     * 进口国/目的国/收件人国家_申报单价（按对应币别的法定单位，最多4位小数点）
     */
    @JsonProperty("declare_unit_price_import")
    private Double declareUnitPriceImport;

    /**
     * 进口国/目的国/收件人国家_申报单价币种（按照ISO标准；支持的币种，根据物流产品+收件人国家配置；币种需和出口国申报币种一致）
     */
    @JsonProperty("currency_import")
    private String currencyImport;

    /**
     * 出口国/起始国/发件人国家_品牌(必填；若无，填none即可)
     */
    @JsonProperty("brand_export")
    private String brandExport;

    /**
     * 进口国/目的国/收件人国家_品牌(必填；若无，填none即可)
     */
    @JsonProperty("brand_import")
    private String brandImport;

    /**
     * 商品销售URL
     */
    @JsonProperty("sales_url")
    private String salesUrl;

    /**
     * 配货字段（打印标签选择显示配货信息是将会显示：package_remarks*qty）
     */
    @JsonProperty("package_remarks")
    private String packageRemarks;
}
