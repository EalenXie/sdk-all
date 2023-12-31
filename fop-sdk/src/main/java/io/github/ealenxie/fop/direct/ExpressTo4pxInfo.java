package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class ExpressTo4pxInfo {
    /**
     * 快递公司
     */
    @JsonProperty("express_company")
    private String expressCompany;

    /**
     * 追踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
}
