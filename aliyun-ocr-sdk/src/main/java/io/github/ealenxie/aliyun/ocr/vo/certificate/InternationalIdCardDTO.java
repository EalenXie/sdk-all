package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFileDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/6 10:40
 */
@Getter
@Setter
public class InternationalIdCardDTO extends UrlFileDTO {
    /**
     * 国家名称。
     * 如：India，Vietnam，Korea，Bangladesh
     */
    @JsonProperty("Country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String country;
}
