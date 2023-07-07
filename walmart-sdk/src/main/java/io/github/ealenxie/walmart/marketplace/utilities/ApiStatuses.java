package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 16:37
 */
@Getter
@Setter
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
