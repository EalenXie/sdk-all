package io.github.ealenxie.paypal.referencedpayouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/7 10:53
 */
@Getter
@Setter
public class ProcessingState {
    @JsonProperty("status")
    private String status;
}
