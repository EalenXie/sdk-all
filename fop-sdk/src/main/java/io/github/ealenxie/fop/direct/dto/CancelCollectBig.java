package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:30
 */
@Getter
@Setter
public class CancelCollectBig {

    /**
     * 取消原因
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;

    /**
     * 揽收大包号
     */
    @JsonProperty("bag_collect_no")
    private String bagCollectNo;
}
