package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:56
 */
@Getter
@Setter
public class GetOutbound {


    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
}
