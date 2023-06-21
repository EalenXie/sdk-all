package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class CertificateInfo {
    @JsonProperty("certificate_type")
    private String certificateType;
    @JsonProperty("certificate_no")
    private String certificateNo;
    @JsonProperty("id_front_url")
    private String idFrontUrl;
    @JsonProperty("id_back_url")
    private String idBackUrl;
}
