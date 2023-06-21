package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/14 10:33
 */

@Getter
@Setter
public class AddProductDTO {
    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("reference_no")
    private String referenceNo;
    @JsonProperty("product_name_cn")
    private String productNameCn;
    @JsonProperty("product_name_en")
    private String productNameEn;
    @JsonProperty("product_weight")
    private String productWeight;
    @JsonProperty("product_length")
    private String productLength;
    @JsonProperty("product_width")
    private String productWidth;
    @JsonProperty("product_height")
    private String productHeight;
    @JsonProperty("contain_battery")
    private String containBattery;
    @JsonProperty("type_of_goods")
    private String typeOfGoods;
    @JsonProperty("cat_lang")
    private String catLang;
    @JsonProperty("cat_id_level2")
    private String catIdLevel2;
    @JsonProperty("verify")
    private String verify;
    @JsonProperty("product_declared_name_cn")
    private String productDeclaredNameCn;
    @JsonProperty("product_declared_name")
    private String productDeclaredName;
    @JsonProperty("product_material")
    private String productMaterial;
    @JsonProperty("product_function")
    private String productFunction;
    @JsonProperty("branded")
    private String branded;
    @JsonProperty("product_brand")
    private String productBrand;
    @JsonProperty("product_model")
    private String productModel;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("product_link")
    private String productLink;
    @JsonProperty("image_link")
    private List<String> imageLink;
    @JsonProperty("export_country")
    private List<ExportCountryDTO> exportCountry;
    @JsonProperty("import_country")
    private List<ExportCountryDTO> importCountry;
    @JsonProperty("certificate_url_list")
    private List<String> certificateUrlList;
    @JsonProperty("thirdparty_sku_mapping")
    private List<String> thirdpartySkuMapping;
    @JsonProperty("return_auth")
    private String returnAuth;
    @JsonProperty("return_replacement_sku")
    private String returnReplacementSku;
    @JsonProperty("batch_management_enabled")
    private String batchManagementEnabled;
    @JsonProperty("batch_info")
    private BatchInfoDTO batchInfo;
    @JsonProperty("sku_wrapper_type")
    private String skuWrapperType;
    @JsonProperty("sn_info")
    private SnInfoDTO snInfo;
    @JsonProperty("battery_info")
    private BatteryInfoDTO batteryInfo;
    @JsonProperty("remark")
    private String remark;
}
