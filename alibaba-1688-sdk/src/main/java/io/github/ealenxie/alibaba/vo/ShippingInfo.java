package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 42
 */
@Getter
@Setter
public class ShippingInfo {
    /**
     * 重量/毛重，单位千克/件
     */
    @JsonProperty("unitWeight")
    private Double unitWeight;
    /**
     * 体积，单位是立方厘米，范围是1-9999999，1688无需关注此字段
     */
    @JsonProperty("volume")
    private Integer volume;
    /**
     * 备货期，单位是天，范围是1-60。1688无需处理此字段
     */
    @JsonProperty("handlingTime")
    private Integer handlingTime;
    /**
     * 运费模板ID，0表示运费说明，1表示卖家承担运费，其他值表示使用运费模版。此参数可调用运费模板相关API获取
     */
    @JsonProperty("freightTemplateID")
    private Long freightTemplateID;
    /**
     * 净重，单位千克/件
     */
    @JsonProperty("suttleWeight")
    private Double suttleWeight;
    /**
     * 发货地描述
     */
    @JsonProperty("sendGoodsAddressText")
    private String sendGoodsAddressText;
    /**
     * 宽度，单位厘米
     */
    @JsonProperty("width")
    private Double width;
    /**
     * 高度，单位厘米
     */
    @JsonProperty("height")
    private Double height;
    /**
     * 长度，单位厘米
     */
    @JsonProperty("length")
    private Double length;
    /**
     * 尺寸，单位是厘米，长宽高范围是1-9999999。1688无需关注此字段
     */
    @JsonProperty("packageSize")
    private String packageSize;
    /**
     * 发货地址ID，国际站无需处理此字段
     */
    @JsonProperty("sendGoodsAddressId")
    private Long sendGoodsAddressId;
}
