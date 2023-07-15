package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:58
 */
@NoArgsConstructor
@Data
public class CancelResponse {
    /**
     * errorIndex
     */
    @JsonProperty("errorIndex")
    private String errorIndex;
    /**
     * errorOrderNo
     */
    @JsonProperty("errorOrderNo")
    private String errorOrderNo;
    /**
     * errorCode
     */
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * errorMsg
     */
    @JsonProperty("errorMsg")
    private String errorMsg;
}
