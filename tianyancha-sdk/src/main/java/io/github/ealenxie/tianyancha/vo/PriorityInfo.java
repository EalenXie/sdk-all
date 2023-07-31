package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/31 9:32
 */
@Getter
@Setter
public class PriorityInfo {
    /**
     * 优先权号
     */
    @JsonProperty("priorityNumber")
    private String priorityNumber;

    /**
     * 优先权日
     */
    @JsonProperty("priorityDate")
    private String priorityDate;
}
