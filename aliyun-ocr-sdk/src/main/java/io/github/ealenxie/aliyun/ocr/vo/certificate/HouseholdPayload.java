package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFilePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/6 9:44
 */
@Getter
@Setter
public class HouseholdPayload extends UrlFilePayload {
    /**
     * 是否是户口本常住人口页，默认为否。
     * true：需要；false：不需要。
     */
    @JsonProperty("IsResidentPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean isResidentPage = false;
}
