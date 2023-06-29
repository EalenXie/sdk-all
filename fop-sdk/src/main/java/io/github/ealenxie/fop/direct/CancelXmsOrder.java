package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:19
 */
@Getter
@Setter
public class CancelXmsOrder {

    /**
     * 取消原因
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;

    /**
     * 请求单号
     */
    @JsonProperty("request_no")
    private String requestNo;
}
