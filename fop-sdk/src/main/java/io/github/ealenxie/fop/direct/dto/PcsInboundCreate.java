package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/25 14:51
 */
@Getter
@Setter
public class PcsInboundCreate {
    /**
     * 当前请求流水（唯一）
     */
    @JsonProperty("outOrderId")
    private String outOrderId;

    /**
     * 平台唯一标识，由系统分配
     */
    @JsonProperty("bizSource")
    private String bizSource;

    /**
     * 买家ID
     */
    @JsonProperty("buyerId")
    private String buyerId;

    /**
     * 承运商单号
     */
    @JsonProperty("labelBarcode")
    private String labelBarcode;

    /**
     * 包裹单号（唯一)
     */
    @JsonProperty("subLabelBarcode")
    private String subLabelBarcode;

    /**
     * 是否带电：Y/N
     */
    @JsonProperty("includeBattery")
    private String includeBattery;

    /**
     * 预报重量（g）
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 长
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 宽
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 高
     */
    @JsonProperty("height")
    private Integer height;

    /**
     * 	包裹申报价值
     */
    @JsonProperty("parcelValue")
    private Double parcelValue;

    /**
     * 包裹申报价值币种
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 目的国编码
     */
    @JsonProperty("destCountry")
    private String destCountry;

    /**
     * 商品信息列表
     */
    @JsonProperty("goodsList")
    private List<Goods> goodsList;
}
