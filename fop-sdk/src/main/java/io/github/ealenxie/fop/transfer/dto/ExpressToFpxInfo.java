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
    @JsonProperty("expressCompany")
    private String expressCompany;
    @JsonProperty("trackingNo")
    private String trackingNo;
}
