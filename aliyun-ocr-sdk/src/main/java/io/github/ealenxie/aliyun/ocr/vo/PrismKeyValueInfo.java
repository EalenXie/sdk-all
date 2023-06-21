package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/4/1 15:52
 */
@Getter
@Setter
public class PrismKeyValueInfo {
    /**
     * 识别出的字段名称
     */
    @JsonProperty("key")
    private String key;
    /**
     * 字段名称置信度
     */
    @JsonProperty("keyProb")
    private Integer keyProb;
    /**
     * 识别出的字段名称对应的值
     */
    @JsonProperty("value")
    private String value;
    /**
     * 字段在原图中的四个点坐标（左上、右上、右下、左下）
     */
    @JsonProperty("valuePos")
    private List<Points> valuePos;
    /**
     * 字段名称对应值的置信度
     */
    @JsonProperty("valueProb")
    private Integer valueProb;
}
