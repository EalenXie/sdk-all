package io.github.ealenxie.fop.pds.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:51
 */
@Getter
@Setter
public class PdsOrderResp {


    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("spNumber")
    private String spNumber;
}
