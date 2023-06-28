package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 14:53
 */
@Getter
@Setter
public class PcsInboundCreateResp {
    /**
     * 4px单号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 承运单号
     */
    @JsonProperty("labelBarcode")
    private String labelBarcode;

    /**
     * 包裹面单号
     */
    @JsonProperty("subLabelBarcode")
    private String subLabelBarcode;
}
