package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 10:28
 */
@NoArgsConstructor
@Data
public class ReturnLabel {

    /**
     * returnGoodsOrderNo
     */
    @JsonProperty("returnGoodsOrderNo")
    private String returnGoodsOrderNo;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * label
     */
    @JsonProperty("label")
    private String label;
}
