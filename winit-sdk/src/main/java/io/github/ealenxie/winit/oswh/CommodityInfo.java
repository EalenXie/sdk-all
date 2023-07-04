package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author create by sch  2023/1/28 15:33
 * @version 1.0
 */
@Getter
@Setter
public class CommodityInfo {

    @JsonProperty("id")
    private String id;
    /**
     * 商品条码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 商品编码
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 商品中文名称
     */
    @JsonProperty("cnName")
    private String cnName;
    /**
     * 商品英文名称
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("volume")
    private BigDecimal volume;
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * 注册重量(千克)
     */
    @JsonProperty("registerWeight")
    private Double registerWeight;
    /**
     * 注册长度(厘米)
     */
    @JsonProperty("registerLength")
    private Double registerLength;
    /**
     * 注册宽度(厘米)
     */
    @JsonProperty("registerWidth")
    private Double registerWidth;
    /**
     * 注册高度(厘米)
     */
    @JsonProperty("registerHeight")
    private Double registerHeight;
    /**
     * 注册体积(CBM)
     */
    @JsonProperty("registerVolume")
    private Double registerVolume;
    /**
     * 商品管理模式，SI:单品管理模式，SKU:商品管理模式
     */
    @JsonProperty("supervisorMode")
    private String supervisorMode;
    /**
     * 品牌名称
     */
    @JsonProperty("brandName")
    private String brandName;
    /**
     * 型号
     */
    @JsonProperty("model")
    private String model;
    /**
     * 是否带插头
     */
    @JsonProperty("isPlus")
    private String isPlus;
    /**
     * 是否带电
     */
    @JsonProperty("isBattery")
    private String isBattery;
    /**
     * 商品刊登网址
     */
    @JsonProperty("displayPageUrl")
    private String displayPageUrl;
    /**
     * 是否有效,Y:有效,N:无效
     */
    @JsonProperty("isActive")
    private String isActive;
    @JsonProperty("sourceType")
    private String sourceType;
    @JsonProperty("isHighValue")
    private String isHighValue;
    @JsonProperty("batteryTypeId")
    private String batteryTypeId;
    @JsonProperty("batteryPackId")
    private String batteryPackId;
    @JsonProperty("batteryPower")
    private String batteryPower;
    @JsonProperty("customsDeclarationList")
    private List<CustomsDeclaration> customsDeclarationList;
    @JsonProperty("itemThirdVos")
    private List<ItemThird> itemThirdVos;
}
