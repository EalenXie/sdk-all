package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 16:37
 */
@NoArgsConstructor
@Data
public class ApiStatuses {
    /**
     * apiGroup
     */
    @JsonProperty("apiGroup")
    private String apiGroup;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * lastUpdatedTime
     */
    @JsonProperty("lastUpdatedTime")
    private String lastUpdatedTime;
}
