package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 14:53
 */
@Getter
@Setter
public class PcsOutboundCreateResp {
    /**
     * 4px单号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 出库单号
     */
    @JsonProperty("orderNo")
    private String orderNo;

}
