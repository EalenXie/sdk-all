package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 14:53
 */
@Getter
@Setter
public class PcsOutboundCreateResp {
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("orderNo")
    private String orderNo;

}
