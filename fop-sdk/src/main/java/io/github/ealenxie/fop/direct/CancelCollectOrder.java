package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:40
 */
@Getter
@Setter
public class CancelCollectOrder {

    /**
     * 取消原因
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;

    /**
     * 预约单号
     */
    @JsonProperty("collect_no")
    private String collectNo;
}
