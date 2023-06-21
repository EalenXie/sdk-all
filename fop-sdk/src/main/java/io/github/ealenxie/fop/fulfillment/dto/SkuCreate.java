package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/14 13:35
 */

@Getter
@Setter
public class SkuCreate {

    @JsonProperty("product_code")
    private String productCode;
    @JsonProperty("specification")
    private String specification;
    @JsonProperty("appearance")
    private String appearance;
    @JsonProperty("characteristic")
    private List<String> characteristic;
    @JsonProperty("sn_rule_code")
    private String snRuleCode;
    @JsonProperty("expired_date")
    private String expiredDate;
    @JsonProperty("sales_link")
    private String salesLink;
    @JsonProperty("include_batch")
    private String includeBatch;
    @JsonProperty("include_battery")
    private String includeBattery;
    @JsonProperty("battery_config")
    private String batteryConfig;
    @JsonProperty("battery_type")
    private String batteryType;
    @JsonProperty("battery_power")
    private String batteryPower;
    @JsonProperty("battery_number")
    private Object batteryNumber;
    @JsonProperty("battery_resource")
    private String batteryResource;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("release_flag")
    private String releaseFlag;
    @JsonProperty("customer_code")
    private String customerCode;
    @JsonProperty("declare_product_code")
    private String declareProductCode;
    @JsonProperty("sku_code")
    private String skuCode;
    @JsonProperty("sku_name")
    private String skuName;
    @JsonProperty("uom")
    private String uom;
    @JsonProperty("wrapping")
    private String wrapping;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("weight_unit")
    private String weightUnit;
    @JsonProperty("length")
    private String length;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("logistics_package")
    private String logisticsPackage;
    @JsonProperty("package_material")
    private String packageMaterial;
    @JsonProperty("picture_url")
    private List<String> pictureUrl;
}
