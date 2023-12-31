package io.github.ealenxie.fop.direct;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:07
 */
@Getter
@Setter
public class CancelPayload {
    /**
     * 4px跟踪号
     */
    private String fpxTrackingNo;

    /**
     * 取消原因
     */
    private String cancelReason;

}
