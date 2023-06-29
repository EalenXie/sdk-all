package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 20:36
 */
@Getter
@Setter
public class Parcel {
    /**
     * 商品信息
     */
    @JsonProperty("goodsList")
    private List<Goods> goodsList;

    /**
     * 包裹实重
     */
    @JsonProperty("grossWeight")
    private Integer grossWeight;

    /**
     * 是否带电
     */
    @JsonProperty("isIncludeBattery")
    private Integer isIncludeBattery;

    /**
     * 不知道这是什么鬼东西
     */
    @JsonProperty("largeFlag")
    private Integer largeFlag;

    /**
     * 预报重
     */
    @JsonProperty("preWeight")
    private Integer preWeight;

    /**
     * 特殊识别（百度是这么翻译的）
     */
    @JsonProperty("specialIdentify")
    private String specialIdentify;

    /**
     * 高
     */
    @JsonProperty("volumeHeight")
    private Integer volumeHeight;

    /**
     * 长
     */
    @JsonProperty("volumeLength")
    private Integer volumeLength;

    /**
     * 单位
     */
    @JsonProperty("volumeUnit")
    private String volumeUnit;

    /**
     * 重量
     */
    @JsonProperty("volumeWeight")
    private Integer volumeWeight;

    /**
     * 宽
     */
    @JsonProperty("volumeWide")
    private Integer volumeWide;

    /**
     * 重量单位
     */
    @JsonProperty("weightUnit")
    private String weightUnit;
}
