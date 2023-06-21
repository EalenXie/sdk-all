package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:19
 */
@Getter
@Setter
public class CancelXmsOrder {


    @JsonProperty("cancel_reason")
    private String cancelReason;
    @JsonProperty("request_no")
    private String requestNo;
}
