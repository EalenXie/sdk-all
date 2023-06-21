package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class ExpressTo4pxInfo {
    @JsonProperty("express_company")
    private String expressCompany;
    @JsonProperty("tracking_no")
    private String trackingNo;
}
