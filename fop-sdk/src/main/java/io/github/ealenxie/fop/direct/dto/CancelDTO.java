package io.github.ealenxie.fop.direct.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:07
 */
@Getter
@Setter
public class CancelDTO {
    private String fpxTrackingNo;
    private String cancelReason;

}
