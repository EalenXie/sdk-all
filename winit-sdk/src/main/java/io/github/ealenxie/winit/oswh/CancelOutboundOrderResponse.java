package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 13:58
 */
@NoArgsConstructor
@Data
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
