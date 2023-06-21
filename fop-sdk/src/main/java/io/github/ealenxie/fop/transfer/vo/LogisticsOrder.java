package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:36
 */
@Getter
@Setter
public class LogisticsOrder {
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
}
