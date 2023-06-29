package io.github.ealenxie.fop.pds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:51
 */
@Getter
@Setter
public class PdsOrderResponse {

    /**
     * 4PX跟踪号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 服务商单号
     */
    @JsonProperty("spNumber")
    private String spNumber;
}
