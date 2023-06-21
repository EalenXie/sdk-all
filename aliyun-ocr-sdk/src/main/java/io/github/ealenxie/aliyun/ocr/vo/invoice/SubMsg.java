package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import io.github.ealenxie.aliyun.ocr.vo.SliceRect;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 13:27
 */
@Getter
@Setter
public class SubMsg {
    /**
     * 图片顺序
     */
    @JsonProperty("index")
    private Integer index;
    /**
     * 图片类型-英文
     */
    @JsonProperty("op")
    private String op;
    /**
     * 结构化信息（result字段）
     */
    @JsonProperty("result")
    private RecognizeData<?> result;
    /**
     * 图片的坐标信息
     */
    @JsonProperty("sliceRect")
    private SliceRect sliceRect;
    /**
     * 图片类型-中文
     */
    @JsonProperty("type")
    private String type;
}
