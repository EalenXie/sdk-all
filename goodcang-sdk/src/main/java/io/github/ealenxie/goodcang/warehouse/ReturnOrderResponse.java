package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:15
 */
@Getter
@Setter
public class ReturnOrderResponse {

    /**
     * 退件单号
     */
    @JsonProperty("asro_code")
    private String asroCode;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
}
