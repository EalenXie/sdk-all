package io.github.ealenxie.aliyun.ocr.vo.word;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFilePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/11 13:52
 */
@Getter
@Setter
public class RecognizeAdvancedPayload extends UrlFilePayload {

    /**
     * 是否输出单字识别结果，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("OutputCharInfo")
    private Boolean outputCharInfo;
    /**
     * 是否需要自动旋转功能，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("NeedRotate")
    private Boolean needRotate;
    /**
     * 是否输出表格识别结果，包含单元格信息，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("OutputTable")
    private Boolean outputTable;
    /**
     * 是否按顺序输出文字块，默认为false。
     * false表示从左往右，从上到下的顺序；true表示从上到下，从左往右的顺序。
     */
    @JsonProperty("NeedSortPage")
    private Boolean needSortPage;
    /**
     * 是否需要图案检测功能，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("OutputFigure")
    private Boolean outputFigure;
    /**
     * 是否需要图案检测功能，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("NoStamp")
    private Boolean noStamp;
    /**
     * 是否需要分段功能，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("Paragraph")
    private Boolean paragraph;
    /**
     * 是否需要成行返回功能，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("Row")
    private Boolean row;

}
