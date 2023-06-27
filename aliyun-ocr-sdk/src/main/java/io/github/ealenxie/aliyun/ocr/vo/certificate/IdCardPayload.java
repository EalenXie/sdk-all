package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFilePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 16:00
 */
@Getter
@Setter
public class IdCardPayload extends UrlFilePayload {


    /**
     * 是否需要图案检测功能，默认不需要。
     * true：需要；false：不需要。
     */
    @JsonProperty("OutputFigure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean outputFigure;
    /**
     * 是否需要身份证质量检测功能，默认不需要。
     * 身份证质量检测功能包含：是否翻拍，是否是复印件，完整度评分，整体质量分数。
     * 注意：如果需要设置此参数，请使用最新版本SDK。如果不需要设置此参数，您无需更新SDK。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("OutputQualityInfo")
    private Boolean outputQualityInfo;


    public IdCardPayload(String url) {
        super(url);
    }

    public IdCardPayload(byte[] body) {
        super(body);
    }
}
