package io.github.ealenxie.fop.pds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/27 15:47
 * <p>
 * 包裹列表
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
     * 重量单位
     */
    @JsonProperty("weightUnit")
    private String weightUnit;

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
     * 长度单位
     */
    @JsonProperty("volumeUnit")
    private String volumeUnit;

    /**
     * 包裹申报价值（最多4位小数）
     */
    @JsonProperty("parcelValue")
    private Integer parcelValue;

    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 是否含电池（Y/N）
     */
    @JsonProperty("includeBattery")
    private String includeBattery;

    /**
     * 货物列表（投保、查验、货物丢失作为参考依据）
     */
    @JsonProperty("productList")
    private List<ParcelProduct> productList;
}
