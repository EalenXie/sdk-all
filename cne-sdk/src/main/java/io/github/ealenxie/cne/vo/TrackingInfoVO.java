package io.github.ealenxie.cne.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/16 11:31
 */
@Getter
@Setter
public class TrackingInfoVO {
    @JsonProperty("trackingNbr")
    private String trackingNbr;
    /**
     * 末端派送单号
     */
    @JsonProperty("transNbr")
    private String transNbr;
    @JsonProperty("Number")
    private String number;
    @JsonProperty("Number_t")
    private String numberT;
}
