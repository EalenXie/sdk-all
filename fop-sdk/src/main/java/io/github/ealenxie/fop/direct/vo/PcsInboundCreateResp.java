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
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;
    @JsonProperty("labelBarcode")
    private String labelBarcode;
    @JsonProperty("subLabelBarcode")
    private String subLabelBarcode;
}
