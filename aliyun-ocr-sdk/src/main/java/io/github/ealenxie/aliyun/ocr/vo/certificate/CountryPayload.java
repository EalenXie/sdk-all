package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFilePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 16:14
 */
@Getter
@Setter
public class CountryPayload extends UrlFilePayload {
    /**
     * 国家名称
     */
    @JsonProperty("Country")
    private String country;
}
