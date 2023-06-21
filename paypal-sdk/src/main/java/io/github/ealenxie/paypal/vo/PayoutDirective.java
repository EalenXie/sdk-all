package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/7 10:53
 */
@Getter
@Setter
public class PayoutDirective {
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("type")
    private String type;
}
