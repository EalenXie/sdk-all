package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/24 13:18
 */
@Getter
@Setter
public class RecognizeData<T> {

    @JsonProperty("algo_version")
    private String algVersion;
    @JsonProperty("codes")
    private List<Codes> codes;
    /**
     * 结构化信息
     */
    @JsonProperty("data")
    private T data;
    /**
     * 是否为复印件（1：是，0：否）
     */
    @JsonProperty("ftype")
    private Integer ftype;
    /**
     * 算法矫正图片后的高度
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * 原图的高度
     */
    @JsonProperty("orgHeight")
    private Integer orgHeight;
    /**
     * 原图的宽度
     */
    @JsonProperty("orgWidth")
    private Integer orgWidth;
    /**
     * 结构化信息的坐标信息
     */
    @JsonProperty("prism_keyValueInfo")
    private List<PrismKeyValueInfo> prismKeyValueInfos;
    /**
     * 结构化信息的坐标信息
     */
    @JsonProperty("sliceRect")
    private SliceRect sliceRect;
    /**
     * 算法矫正图片后的宽度
     */
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("figure")
    private List<Figure> figure;
}
