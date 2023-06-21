package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:40
 */
@Getter
@Setter
public class CancelCollectOrder {

    @JsonProperty("cancel_reason")
    private String cancelReason;
    @JsonProperty("collect_no")
    private String collectNo;
}
