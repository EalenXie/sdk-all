package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:46
 */
@Getter
@Setter
public class CarNumberInfo {
    /**
     * valueLoc
     */
    @JsonProperty("value_loc")
    private String valueLoc;
    /**
     * 字段名称置信度
     */
    @JsonProperty("key_prob")
    private Double keyProb;
    /**
     * keyLoc
     */
    @JsonProperty("key_loc")
    private String keyLoc;
    /**
     * 字段名称对应值的置信度
     */
    @JsonProperty("value_prob")
    private Double valueProb;
    /**
     * 识别出的字段名称对应的值
     */
    @JsonProperty("value")
    private String value;
    /**
     * 识别出的字段名称
     */
    @JsonProperty("key")
    private String key;
}
