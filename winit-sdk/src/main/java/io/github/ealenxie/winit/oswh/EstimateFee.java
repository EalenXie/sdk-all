package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 14:39
 * @version 1.0
 */
@Getter
@Setter
public class EstimateFee {
    /**
     * feeNode
     */
    @JsonProperty("feeNode")
    private String feeNode;
    /**
     * fee
     */
    @JsonProperty("fee")
    private Integer fee;
    /**
     * feeName
     */
    @JsonProperty("feeName")
    private String feeName;
    /**
     * feeCurrency
     */
    @JsonProperty("feeCurrency")
    private String feeCurrency;
}
