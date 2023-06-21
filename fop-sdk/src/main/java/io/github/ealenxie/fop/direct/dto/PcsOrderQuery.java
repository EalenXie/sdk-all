package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/28 14:30
 */
@Getter
@Setter
public class PcsOrderQuery {


    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("orderType")
    private String orderType;
}
