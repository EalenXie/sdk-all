package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:15
 */
@Getter
@Setter
public class PcsOrderResp {

    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("status")
    private String status;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("at")
    private String at;
    @JsonProperty("ext")
    private Ext ext;
}
