package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.aliyun.ocr.dto.UrlFileDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 18:03
 */
@Getter
@Setter
public class InternationalBusinessLicenseDTO extends UrlFileDTO {

    /**
     * 国家名称
     * India（India、Korea）
     */
    @JsonProperty("Country")
    private String country;

}
