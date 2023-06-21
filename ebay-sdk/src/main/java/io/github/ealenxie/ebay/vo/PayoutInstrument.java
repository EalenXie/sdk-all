package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 15:43
 */
@Getter
@Setter
public class PayoutInstrument {
    @JsonProperty("instrumentType")
    private String instrumentType;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("accountLastFourDigits")
    private String accountLastFourDigits;
}
