package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 13:58
 */
@Getter
@Setter
public class CancelOutboundOrderResponse {

    /**
     * failNum
     */
    @JsonProperty("failNum")
    private Integer failNum;
    /**
     * successNum
     */
    @JsonProperty("successNum")
    private Integer successNum;
    /**
     * response
     */
    @JsonProperty("response")
    private List<CancelResponse> response;
}
