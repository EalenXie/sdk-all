package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:18
 */
@Getter
@Setter
public class CertificateInfo {
    @JsonProperty("certificateType")
    private String certificateType;
    @JsonProperty("certificateNo")
    private String certificateNo;
    @JsonProperty("idFrontUrl")
    private String idFrontUrl;
    @JsonProperty("idBackUrl")
    private String idBackUrl;
}
