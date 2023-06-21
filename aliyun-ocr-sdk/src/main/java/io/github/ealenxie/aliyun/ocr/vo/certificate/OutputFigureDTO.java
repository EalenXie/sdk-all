package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFileDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/6 10:18
 */
@Getter
@Setter
public class OutputFigureDTO extends UrlFileDTO {
    /**
     * 是否需要图案检测功能，默认需要
     * true：需要；false：不需要。
     */
    @JsonProperty("OutputFigure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean outPutFigure;
}
