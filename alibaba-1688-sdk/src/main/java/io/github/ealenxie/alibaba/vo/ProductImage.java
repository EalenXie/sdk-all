package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 29
 */
@Getter
@Setter
public class ProductImage {

    /**
     * 主图列表，使用相对路径，需要增加域名：<a href="https://cbu01.alicdn.com/">https://cbu01.alicdn.com</a>
     */
    @JsonProperty("images")
    private List<String> images;
    /**
     * 是否打水印，是(true)或否(false)，1688无需关注此字段，1688的水印信息在上传图片时处理
     */
    @JsonProperty("isWatermark")
    private Boolean isWatermark;
    /**
     * 水印是否有边框，有边框(true)或者无边框(false)，1688无需关注此字段，1688的水印信息在上传图片时处理
     */
    @JsonProperty("isWatermarkFrame")
    private Boolean isWatermarkFrame;
    /**
     * 水印位置，在中间(center)或者在底部(bottom)，1688无需关注此字段，1688的水印信息在上传图片时处理
     */
    @JsonProperty("watermarkPosition")
    private String watermarkPosition;
}
