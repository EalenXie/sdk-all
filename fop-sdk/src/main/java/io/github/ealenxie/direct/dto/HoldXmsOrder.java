package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:23
 */
@Getter
@Setter
public class HoldXmsOrder {

    @JsonProperty("request_no")
    private String requestNo;
    @JsonProperty("is_hold")
    private String isHold;
    @JsonProperty("hold_reason")
    private String holdReason;
}
