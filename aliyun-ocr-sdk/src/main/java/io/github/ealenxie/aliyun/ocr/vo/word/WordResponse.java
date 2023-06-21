package io.github.ealenxie.aliyun.ocr.vo.word;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/11 14:44
 */
@Getter
@Setter
public class WordResponse {
    /**
     * 识别出图片的文字块汇总
     */
    @JsonProperty("content")
    private String content;
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
     * prismVersion
     */
    @JsonProperty("prism_version")
    private String prismVersion;
    /**
     * 识别的文字块的数量，prism_wordsInfo数组的大小
     */
    @JsonProperty("prism_wnum")
    private Integer prismWnum;
    /**
     * 文字块信息
     */
    @JsonProperty("prism_wordsInfo")
    private List<PrismWordsInfo> prismWordsInfo;
    /**
     * 算法矫正图片后的宽度
     */
    @JsonProperty("width")
    private Integer width;
}
