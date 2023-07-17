package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:43
 */
@Getter
@Setter
public class ReturnOrderVoidResponse {


    /**
     * failedCount
     */
    @JsonProperty("failedCount")
    private Integer failedCount;
    /**
     * successCount
     */
    @JsonProperty("successCount")
    private Integer successCount;
    /**
     * results
     */
    @JsonProperty("results")
    private List<ReturnOrderVoidResult> results;
}
