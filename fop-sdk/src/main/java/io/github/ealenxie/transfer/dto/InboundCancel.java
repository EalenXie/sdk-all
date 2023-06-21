package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:52
 */
@Getter
@Setter
public class InboundCancel {


    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("cancelReason")
    private String cancelReason;
}
