package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class Parcel {
    /**
     * 预报重量（g）
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 包裹长（cm）
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 包裹宽（cm）
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 包裹高（cm）
     */
    @JsonProperty("height")
    private Integer height;

    /**
     * 包裹申报价值（最多4位小数）
     */
    @JsonProperty("parcel_value")
    private Double parcelValue;

    /**
     * 包裹申报价值币别（按照ISO标准三字码；支持的币种，根据物流产品+收件人国家配置；币种需和进出口国申报币种一致）
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 是否含电池（Y/N）
     */
    @JsonProperty("include_battery")
    private String includeBattery;

    /**
     * 带电类型
     */
    @JsonProperty("battery_type")
    private String batteryType;

    /**
     * [@即将废弃]投保物品信息（投保、查验、货物丢失作为参考依据）
     */
    @JsonProperty("product_list")
    private List<Product> productList;

    /**
     * 海关申报信息
     * <p>
     * 每个包裹的申报信息，方式1：填写申报产品代码和申报数量；方式2：填写其他详细申报信息
     */
    @JsonProperty("declare_product_info")
    private List<DeclareProductInfo> declareProductInfo;


}
