package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:18
 * <p>
 * 证件信息
 */
@Getter
@Setter
public class CertificateInfo {
    /**
     * 证件类型
     */
    @JsonProperty("idType")
    private String idType;

    /**
     * 证件号
     */
    @JsonProperty("idNo")
    private String idNo;

    /**
     * 证件正面照URL
     */
    @JsonProperty("idFrontUrl")
    private String idFrontUrl;

    /**
     * 证件背面照URL
     */
    @JsonProperty("idBackUrl")
    private String idBackUrl;
}
