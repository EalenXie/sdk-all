package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 14:17
 * @version 1.0
 */
@Getter
@Setter
public class CycleExecution {
    /**
     * tenureType
     */
    @JsonProperty("tenure_type")
    private String tenureType;
    /**
     * sequence
     */
    @JsonProperty("sequence")
    private Integer sequence;
    /**
     * cyclesCompleted
     */
    @JsonProperty("cycles_completed")
    private Integer cyclesCompleted;
    /**
     * cyclesRemaining
     */
    @JsonProperty("cycles_remaining")
    private Integer cyclesRemaining;
    /**
     * totalCycles
     */
    @JsonProperty("total_cycles")
    private Integer totalCycles;
}
