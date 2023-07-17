package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:43
 */
@NoArgsConstructor
@Data
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
