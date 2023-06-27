package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class ExpressToFpxInfo {
    /**
     * 快递公司
     */
    @JsonProperty("expressCompany")
    private String expressCompany;

    /**
     * 追踪号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
}
