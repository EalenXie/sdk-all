package io.github.ealenxie.aliyun.ocr.vo.word;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFileDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/11 14:49
 */
@Getter
@Setter
public class TableOcrDTO extends UrlFileDTO {


    /**
     * 是否需要自动旋转功能，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("NeedRotate")
    private Boolean needRotate;
    /**
     * 是否无线条或者只有横线没有竖线,默认无线条。
     * true：无线条；false：有线条。
     */
    @JsonProperty("LineLess")
    private Boolean lineLess;
    /**
     * 是否跳过检测，默认为false。
     * true：跳过检查；false：跳过检查。
     */
    @JsonProperty("SkipDetection")
    private Boolean skipDetection;
    /**
     * 是否是手写表格，默认不是。
     * true：是手写表格；false：不是手写表格。
     * 注意：该字段是字符串类型。
     */
    @JsonProperty("IsHandWriting")
    private String isHandWriting;
}
