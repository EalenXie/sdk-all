package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:47
 */
@Getter
@Setter
public class LogisticsServiceInfo {
    @JsonProperty("logisticsServiceCode")
    private String logisticsServiceCode;
    @JsonProperty("signatureService")
    private String signatureService;
}
