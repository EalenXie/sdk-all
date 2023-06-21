package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:10
 */
@Getter
@Setter
public class FpxTrackingNoVO {

    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
}
